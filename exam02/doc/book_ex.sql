-- 게시판
CREATE TABLE `book_ex`.`tbl_board` (
	`bno`     INTEGER      NOT NULL COMMENT '번호', -- 번호
	`title`   VARCHAR(255) NULL     COMMENT '제목', -- 제목
	`content` TEXT         NULL     COMMENT '내용', -- 내용
	`writer`  VARCHAR(50)  NULL     COMMENT '작성자', -- 작성자
	`regdate` TIMESTAMP    NULL     COMMENT '등록일', -- 등록일
	`viewcnt` INTEGER      NULL     COMMENT '조회수' -- 조회수
)
COMMENT '게시판';

-- 게시판
ALTER TABLE `book_ex`.`tbl_board`
	ADD CONSTRAINT `PK_tbl_board` -- 게시판 기본키
		PRIMARY KEY (
			`bno` -- 번호
		);

ALTER TABLE `book_ex`.`tbl_board`
	MODIFY COLUMN `bno` INTEGER NOT NULL AUTO_INCREMENT COMMENT '번호';

ALTER TABLE `book_ex`.`tbl_board`
	AUTO_INCREMENT = 1;