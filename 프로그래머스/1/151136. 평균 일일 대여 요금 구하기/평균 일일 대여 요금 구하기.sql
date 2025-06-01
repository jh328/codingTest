# 렌트회사
# 자동차 종류가 있음. 옵션 리스트는 콤마로 구분이 됨. 
# CEILING(daily_fee) suv 일일 렌트비용 렌트비용 소수 첫 번재 자리에서 반올림 / 1031000
# SELECT CEILING(1031000)
# FROM CAR_RENTAL_COMPANY_CAR AS c
# where c.CAR_TYPE like 'SUV'

SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR AS c
where c.CAR_TYPE like 'suv'