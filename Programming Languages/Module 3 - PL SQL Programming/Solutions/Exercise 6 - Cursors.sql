SET SERVEROUTPUT ON;

DECLARE

    CURSOR GenerateMonthlyStatements IS
        SELECT
            c.Name,
            t.TransactionDate,
            t.Amount,
            t.TransactionType
        FROM Customers c
        JOIN Accounts a
            ON c.CustomerID = a.CustomerID
        JOIN Transactions t
            ON a.AccountID = t.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

BEGIN

    FOR rec IN GenerateMonthlyStatements LOOP

        DBMS_OUTPUT.PUT_LINE(
            rec.Name || ' | ' ||
            rec.TransactionDate || ' | ' ||
            rec.TransactionType || ' | ' ||
            rec.Amount
        );

    END LOOP;

END;
/
SET SERVEROUTPUT ON;

DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID
        FROM Accounts;

BEGIN

    FOR rec IN ApplyAnnualFee LOOP

        UPDATE Accounts
        SET Balance = Balance - 500
        WHERE AccountID = rec.AccountID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Annual maintenance fee applied.');

END;
/
SET SERVEROUTPUT ON;

DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans;

BEGIN

    FOR rec IN UpdateLoanInterestRates LOOP

        UPDATE Loans
        SET InterestRate = rec.InterestRate - 0.5
        WHERE LoanID = rec.LoanID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan interest rates updated.');

END;
/