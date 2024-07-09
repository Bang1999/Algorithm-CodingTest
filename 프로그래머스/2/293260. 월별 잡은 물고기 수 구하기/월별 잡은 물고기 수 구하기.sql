-- 코드를 작성해주세요
SELECT 
       COUNT(CAST(DATE_FORMAT(A.TIME, '%m') AS UNSIGNED)) AS FISH_COUNT
     , CAST(DATE_FORMAT(A.TIME, '%m') AS UNSIGNED) AS MONTH
  FROM FISH_INFO AS A
 GROUP BY MONTH
 ORDER BY MONTH ASC;