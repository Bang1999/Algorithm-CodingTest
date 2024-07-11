-- 코드를 입력하세요
SELECT
       A.CAR_ID
     , ROUND(AVG(DATEDIFF(A.END_DATE, A.START_DATE)), 1) + 1 AS AVERAGE_DURATION
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
 GROUP BY A.CAR_ID
HAVING ROUND(AVG(DATEDIFF(A.END_DATE, A.START_DATE)), 1) + 1 >= 7
 ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC;