CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account NUMBER,
    p_to_account NUMBER,
    p_amount NUMBER
)
IS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001,'Insufficient Funds');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;

    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT;

EXCEPTION

    WHEN OTHERS THEN

        INSERT INTO ErrorLog(ErrorMessage,LogDate)
        VALUES(SQLERRM,SYSDATE);

        ROLLBACK;

END;
/
CREATE OR REPLACE PROCEDURE UpdateSalary(

    p_employee_id NUMBER,
    p_percentage NUMBER

)
IS

BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * p_percentage /100)
    WHERE EmployeeID = p_employee_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002,'Employee ID does not exist');
    END IF;

    COMMIT;

EXCEPTION

    WHEN OTHERS THEN

        INSERT INTO ErrorLog(ErrorMessage,LogDate)
        VALUES(SQLERRM,SYSDATE);

        ROLLBACK;

END;
/
CREATE OR REPLACE PROCEDURE AddNewCustomer(

    p_customerid NUMBER,
    p_name VARCHAR2,
    p_dob DATE,
    p_balance NUMBER

)
IS

BEGIN

    INSERT INTO Customers(

        CustomerID,
        Name,
        DOB,
        Balance,
        LastModified

    )

    VALUES(

        p_customerid,
        p_name,
        p_dob,
        p_balance,
        SYSDATE

    );

    COMMIT;

EXCEPTION

    WHEN DUP_VAL_ON_INDEX THEN

        INSERT INTO ErrorLog(ErrorMessage,LogDate)
        VALUES('Customer already exists',SYSDATE);

        ROLLBACK;

    WHEN OTHERS THEN

        INSERT INTO ErrorLog(ErrorMessage,LogDate)
        VALUES(SQLERRM,SYSDATE);

        ROLLBACK;

END;
/