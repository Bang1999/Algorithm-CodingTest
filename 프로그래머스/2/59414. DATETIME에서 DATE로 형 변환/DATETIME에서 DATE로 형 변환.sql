-- 코드를 입력하세요
SELECT
       A.ANIMAL_ID
     , A.NAME
     , DATE_FORMAT(A.DATETIME, '%Y-%m-%d') AS '날짜'
  FROM ANIMAL_INS AS A
 ORDER BY A.ANIMAL_ID ASC;
  