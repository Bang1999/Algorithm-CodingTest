-- 코드를 작성해주세요
SELECT
       CONCAT(A.LENGTH, 'cm') AS 'MAX_LENGTH'
  FROM FISH_INFO AS A
 ORDER BY A.LENGTH DESC LIMIT 1;