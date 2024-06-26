-- 코드를 작성해주세요
SELECT
       A.ITEM_ID
     , A.ITEM_NAME
  FROM ITEM_INFO AS A
  LEFT JOIN ITEM_TREE AS B ON (A.ITEM_ID = B.ITEM_ID)
 WHERE B.PARENT_ITEM_ID IS NULL
 ORDER BY A.ITEM_ID ASC;