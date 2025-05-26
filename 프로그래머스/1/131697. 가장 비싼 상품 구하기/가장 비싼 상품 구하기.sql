# 가장 높은 판매가 출력
SELECT p.price 
FROM PRODUCT AS p
where p.product_id = 6
# order by p.price desc