-- 코드를 입력하세요
SELECT
       A.ANIMAL_ID
     , A.NAME
     , CASE
            WHEN A.SEX_UPON_INTAKE IN ('Neutered Male', 'Neutered Female', 'Spayed Male', 'Spayed Female') THEN 'O'
            ELSE 'X'
       END AS '중성화'
  FROM ANIMAL_INS AS A
 ORDER BY A.ANIMAL_ID ASC;