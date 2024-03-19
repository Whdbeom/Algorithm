-- 코드를 입력하세요
-- 7월 아이스크림 총 주문량과 
-- 상반기의 아이스크림 총 주문량을 
-- 더한 값이 
-- 큰 순서대로 상위 3개의 맛을 조회
SELECT FLAVOR
FROM (
        SELECT *
        FROM JULY
        UNION
        SELECT *
        FROM FIRST_HALF
    )
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
FETCH FIRST 3 ROWS ONLY;