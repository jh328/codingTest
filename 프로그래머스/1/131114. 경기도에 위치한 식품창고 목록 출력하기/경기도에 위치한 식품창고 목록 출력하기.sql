select fa.WAREHOUSE_ID , fa.WAREHOUSE_NAME , fa.ADDRESS , ifnull(fa.FREEZER_YN, 'N') 
from FOOD_WAREHOUSE AS fa
where fa.ADDRESS like '경기도%'
order by fa.WAREHOUSE_ID asc