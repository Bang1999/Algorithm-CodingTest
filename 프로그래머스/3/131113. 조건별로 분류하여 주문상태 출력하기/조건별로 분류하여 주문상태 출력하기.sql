-- 코드를 입력하세요
SELECT
       A.ORDER_ID
     , A.PRODUCT_ID
     , DATE_FORMAT(A.OUT_DATE, '%Y-%m-%d') AS OUT_DATE
     , CASE
            WHEN A.OUT_DATE IS NULL THEN '출고미정'
            WHEN DATEDIFF(DATE_FORMAT(A.OUT_DATE, '%Y-%m-%d'), '2022-05-01') > 0 THEN '출고대기'
            ELSE '출고완료'
       END AS '출고여부'
  FROM FOOD_ORDER AS A
 ORDER BY A.ORDER_ID ASC;