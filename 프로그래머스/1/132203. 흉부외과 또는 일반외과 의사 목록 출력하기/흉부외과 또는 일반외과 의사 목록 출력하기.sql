SELECT d.DR_NAME , d.DR_ID, d.MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
from DOCTOR AS d
where d.MCDP_CD in('CS','GS')
order by d.HIRE_YMD desc