-- 1. 
SELECT
    EMP_ID,
	EMP_NAME,
    PHONE,
    HIRE_DATE,
    ENT_YN
FROM
	employee
WHERE
	ENT_YN = 'N'  AND PHONE LIKE '%2'
ORDER BY
	HIRE_DATE DESC
LIMIT 3;




-- 2.
SELECT
	a.EMP_NAME,
    b.JOB_NAME,
    a.SALARY,
    a.EMP_ID,
    a.EMAIL,
    a.PHONE,
    a.HIRE_DATE
FROM
	employee a
JOIN
	job b ON b.JOB_NAME = '대리' AND a.ENT_YN = 'N'
ORDER BY
	SALARY DESC;
	
	
    
    