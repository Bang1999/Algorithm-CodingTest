-- 코드를 입력하세요
SELECT
       FLOOR(A.PRICE/10000.0)*10000 AS PRICE_GROUP
     , COUNT(CEIL(A.PRICE/10000.0)) AS PRODUCTS
  FROM PRODUCT AS A
 GROUP BY FLOOR(A.PRICE/10000.0)
 ORDER BY FLOOR(A.PRICE/10000.0);