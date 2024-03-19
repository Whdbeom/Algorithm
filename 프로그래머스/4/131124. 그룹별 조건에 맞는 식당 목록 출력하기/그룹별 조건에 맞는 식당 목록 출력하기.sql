-- 코드를 입력하세요
-- 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회
-- 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력
-- 리뷰 작성일 AC, 리뷰 텍스트 ASC
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') REVIEW_DATE
FROM MEMBER_PROFILE M
JOIN REST_REVIEW R ON M.MEMBER_ID = R.MEMBER_ID
WHERE M.MEMBER_ID = (
                        SELECT *
                        FROM (
                                SELECT M.MEMBER_ID AS ID
                                        -- ,COUNT(REVIEW_ID) 
                                FROM MEMBER_PROFILE M
                                JOIN REST_REVIEW R ON M.MEMBER_ID = R.MEMBER_ID
                                GROUP BY M.MEMBER_ID
                                ORDER BY COUNT(REVIEW_ID) DESC
                            )
                        WHERE ROWNUM = 1
                    )
ORDER BY R.REVIEW_DATE, R.REVIEW_TEXT;