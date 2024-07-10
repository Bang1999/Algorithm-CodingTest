-- 코드를 입력하세요
SELECT
       CONCAT('/home/grep/src/', A.BOARD_ID, '/', B.FILE_ID, B.FILE_NAME, B.FILE_EXT) AS FILE_PATH
  FROM USED_GOODS_BOARD AS A
  JOIN USED_GOODS_FILE AS B ON(A.BOARD_ID = B.BOARD_ID)
 WHERE A.VIEWS = (SELECT
                         MAX(C.VIEWS)
                    FROM USED_GOODS_BOARD AS C)
 ORDER BY B.FILE_ID DESC;