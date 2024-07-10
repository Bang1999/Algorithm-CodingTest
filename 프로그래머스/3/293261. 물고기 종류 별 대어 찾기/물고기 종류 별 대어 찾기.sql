-- 코드를 작성해주세요
SELECT
       A.ID
     , B.FISH_NAME
     , A.LENGTH
  FROM FISH_INFO AS A
  JOIN FISH_NAME_INFO AS B ON(A.FISH_TYPE = B.FISH_TYPE)
 WHERE A.FISH_TYPE IN (SELECT
                           C.FISH_TYPE
                      FROM FISH_INFO AS C
                     GROUP BY C.FISH_TYPE
                    HAVING LENGTH = MAX(C.LENGTH));