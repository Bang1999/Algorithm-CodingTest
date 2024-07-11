-- 코드를 입력하세요
SELECT
       A.ANIMAL_ID
     , A.NAME
     , A.SEX_UPON_INTAKE
  FROM ANIMAL_INS AS A
 WHERE A.NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty');