SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,  IFNULL(FREEZER_YN, "N") AS FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS Like "%경기%"
ORDER BY WAREHOUSE_ID ASC
