CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE
ON Customers
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT
ON Transactions
FOR EACH ROW
BEGIN

    INSERT INTO AuditLog
    (
        TransactionID,
        AccountID,
        TransactionDate,
        Amount,
        TransactionType,
        LogDate
    )
    VALUES
    (
        :NEW.TransactionID,
        :NEW.AccountID,
        :NEW.TransactionDate,
        :NEW.Amount,
        :NEW.TransactionType,
        SYSDATE
    );

END;
/
CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW

DECLARE

    v_balance Accounts.Balance%TYPE;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    IF UPPER(:NEW.TransactionType) = 'WITHDRAWAL'
       AND :NEW.Amount > v_balance THEN

        RAISE_APPLICATION_ERROR(
            -20020,
            'Withdrawal exceeds available balance'
        );

    ELSIF UPPER(:NEW.TransactionType) = 'DEPOSIT'
          AND :NEW.Amount <= 0 THEN

        RAISE_APPLICATION_ERROR(
            -20021,
            'Deposit amount must be positive'
        );

    END IF;

END;
/