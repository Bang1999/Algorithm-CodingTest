-- 코드를 입력하세요
SELECT
       A.ANIMAL_TYPE
     , IFNULL(A.NAME, 'No name')
     , A.SEX_UPON_INTAKE
  FROM ANIMAL_INS AS A;
  