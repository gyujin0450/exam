-- 테비블 생성 (p126)
create table tbl_member (
	userid varchar(50) not null,
    userpw varchar(50) not null,
    username varchar(50) not null,
    email varchar(100),
    regdate timestamp default now(),
    updatedate timestamp default now(),
    primary key(userid)    
);

desc tbl_member;

select now();

select * from tbl_member;

