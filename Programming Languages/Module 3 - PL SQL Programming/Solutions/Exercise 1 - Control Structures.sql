SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE, DOB)/12) AS Age
        FROM Customers;

BEGIN

    FOR customer_record IN customer_cursor LOOP

        IF customer_record.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Scenario 1 Completed');

END;
/
SET SERVEROUTPUT ON;

BEGIN

    UPDATE Customers
    SET IsVIP = 'Y'
    WHERE Balance > 10000;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Scenario 2 Completed');

END;
/
SET SERVEROUTPUT ON;

DECLARE

    CURSOR loan_cursor IS
        SELECT c.Name,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE
                            AND SYSDATE + 30;

BEGIN

    FOR loan_record IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder : '
            || loan_record.Name
            || ' loan due on '
            || TO_CHAR(loan_record.EndDate,'DD-MON-YYYY'));

    END LOOP;

END;
/