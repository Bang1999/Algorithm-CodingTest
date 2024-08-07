-- 코드를 입력하세요
SELECT
       LEFT(A.PRODUCT_CODE, 2) AS CATEGORY
     , COUNT(LEFT(A.PRODUCT_CODE, 2)) AS PRODUCTS
  FROM PRODUCT AS A
 GROUP BY LEFT(A.PRODUCT_CODE, 2)
 ORDER BY CATEGORY ASC;