-- 코드를 작성해주세요
SELECT 
       SUM(A.PRICE) AS 'TOTAL_PRICE'
  FROM ITEM_INFO AS A
 WHERE A.RARITY = 'LEGEND';