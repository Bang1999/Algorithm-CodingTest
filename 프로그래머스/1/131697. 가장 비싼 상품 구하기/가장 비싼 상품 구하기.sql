-- 코드를 입력하세요
SELECT
       MAX(A.PRICE) AS MAX_PRICE
  FROM (SELECT 
               PRICE
          FROM PRODUCT AS B
         GROUP BY PRICE) AS A