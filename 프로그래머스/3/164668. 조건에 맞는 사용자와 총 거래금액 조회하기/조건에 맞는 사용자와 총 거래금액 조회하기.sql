SELECT U.USER_ID AS USER_ID,
       U.NICKNAME AS NICKNAME,
       SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD AS B
    INNER JOIN USED_GOODS_USER AS U 
    ON B.WRITER_ID = U.USER_ID
WHERE B.STATUS = 'DONE'
GROUP BY USER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY TOTAL_SALES;