-- 코드를 입력하세요
SELECT
       A.ANIMAL_ID
  FROM ANIMAL_INS AS A
 WHERE A.NAME IS NOT NULL
 ORDER BY A.ANIMAL_ID ASC;