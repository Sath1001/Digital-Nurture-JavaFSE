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
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddNewCustomer(
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

    END;

    PROCEDURE UpdateCustomerDetails(
        p_customerid NUMBER,
        p_name VARCHAR2
    )
    IS
    BEGIN

        UPDATE Customers
        SET Name = p_name
        WHERE CustomerID = p_customerid;

    END;

    FUNCTION GetCustomerBalance(
        p_customerid NUMBER
    )
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN

        SELECT Balance
        INTO v_balance
        FROM Customers
        WHERE CustomerID = p_customerid;

        RETURN v_balance;

    END;

END CustomerManagement;
/

CREATE OR REPLACE PACKAGE EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_employeeid NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hiredate DATE
    );

    PROCEDURE UpdateEmployeeDetails(
        p_employeeid NUMBER,
        p_salary NUMBER
    );

    FUNCTION CalculateAnnualSalary(
        p_employeeid NUMBER
    )
    RETURN NUMBER;

END EmployeeManagement;
/
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_employeeid NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hiredate DATE
    )
    IS
    BEGIN

        INSERT INTO Employees
        VALUES(
            p_employeeid,
            p_name,
            p_position,
            p_salary,
            p_department,
            p_hiredate
        );

    END;

    PROCEDURE UpdateEmployeeDetails(
        p_employeeid NUMBER,
        p_salary NUMBER
    )
    IS
    BEGIN

        UPDATE Employees
        SET Salary = p_salary
        WHERE EmployeeID = p_employeeid;

    END;

    FUNCTION CalculateAnnualSalary(
        p_employeeid NUMBER
    )
    RETURN NUMBER
    IS

        v_salary NUMBER;

    BEGIN

        SELECT Salary
        INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_employeeid;

        RETURN v_salary * 12;

    END;

END EmployeeManagement;
/


CREATE OR REPLACE PACKAGE AccountOperations AS

    PROCEDURE OpenAccount(
        p_accountid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    );

    PROCEDURE CloseAccount(
        p_accountid NUMBER
    );

    FUNCTION GetTotalBalance(
        p_customerid NUMBER
    )
    RETURN NUMBER;

END AccountOperations;
/
CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(
        p_accountid NUMBER,
        p_customerid NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    )
    IS
    BEGIN

        INSERT INTO Accounts(
            AccountID,
            CustomerID,
            AccountType,
            Balance,
            LastModified
        )
        VALUES(
            p_accountid,
            p_customerid,
            p_type,
            p_balance,
            SYSDATE
        );

    END;

    PROCEDURE CloseAccount(
        p_accountid NUMBER
    )
    IS
    BEGIN

        DELETE FROM Accounts
        WHERE AccountID = p_accountid;

    END;

    FUNCTION GetTotalBalance(
        p_customerid NUMBER
    )
    RETURN NUMBER
    IS

        v_total NUMBER;

    BEGIN

        SELECT SUM(Balance)
        INTO v_total
        FROM Accounts
        WHERE CustomerID = p_customerid;

        RETURN NVL(v_total,0);

    END;

END AccountOperations;
/