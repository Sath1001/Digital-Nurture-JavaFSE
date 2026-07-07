CREATE OR REPLACE FUNCTION CalculateAge(

    p_dob DATE

)

RETURN NUMBER

IS

    v_age NUMBER;

BEGIN

    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);

    RETURN v_age;

END;
/
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(

    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_duration_years NUMBER

)

RETURN NUMBER

IS

    v_monthly_interest NUMBER;
    v_total_months NUMBER;
    v_installment NUMBER;

BEGIN

    v_monthly_interest := (p_interest_rate / 100) / 12;

    v_total_months := p_duration_years * 12;

    v_installment :=
        (p_loan_amount * v_monthly_interest * POWER(1 + v_monthly_interest, v_total_months))
        /
        (POWER(1 + v_monthly_interest, v_total_months) - 1);

    RETURN ROUND(v_installment, 2);

END;
/
CREATE OR REPLACE FUNCTION HasSufficientBalance(

    p_account_id NUMBER,
    p_amount NUMBER

)

RETURN BOOLEAN

IS

    v_balance Accounts.Balance%TYPE;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    RETURN v_balance >= p_amount;

EXCEPTION

    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;

END;
/