-- 코드를 작성해주세요
SELECT 
       A.ID
     , A.LENGTH
  FROM FISH_INFO AS A
 ORDER BY A.LENGTH DESC, A.ID ASC
 LIMIT 0, 10;
