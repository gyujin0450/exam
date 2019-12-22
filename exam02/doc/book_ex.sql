-- EXERD 자동생성된 테이블 삭제  
-- Default 지정등릉 못함...
drop table tbl_board;

-- 게시판 DDL
CREATE TABLE `book_ex`.`tbl_board` (
	`bno`     INT 			NOT NULL 	Auto_Increment,
	`title`   VARCHAR(200) 	Not NULL,
	`content` TEXT         	NULL,
	`writer`  VARCHAR(50)  	Not NULL,
	`regdate` TIMESTAMP    	NOT NULL 	Default now(), 
	`viewcnt` INT		    NULL		Default 0,
    Primary key (bno)
);

select * from tbl_board;

-- 테스트를 위한 SQL 준비

-- 새로운 게시물의 등록에 사용하는 SQL
insert into tbl_board( title, content, writer)
values('제목','내용','user00');

-- 게시물의 조회에 사용하는 SQL
select * from tbl_board where bno=1;

-- 게시물의 전체 목록에 사용하는 SQL
select * from tbl_board where bno > 0 order by bno desc;

-- 게시물의 수정에 사용하는 SQL
update tbl_board set title="제목수정" where bno=1;

-- 게시물의 삭제에 사용하는 SQL
delete from tbl_board where bno = 1;

commit;