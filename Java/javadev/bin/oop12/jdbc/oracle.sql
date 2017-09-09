-- drop table j_member;

CREATE TABLE j_member(
	id			VARCHAR2(30)	PRIMARY KEY,
	name		VARCHAR2(30)	NOT NULL,
	password	VARCHAR2(30)	NOT NULL
);

insert into j_member(id, name, password)
values('ryu','������','1234');

select * from j_member;

--drop table j_board;
--drop sequence j_board_seq;

CREATE TABLE j_board(
	no			NUMBER			PRIMARY KEY,
	title		VARCHAR2(100)	NOT NULL,
	name		VARCHAR2(30)	NOT NULL,
	password	VARCHAR2(100)	NOT NULL,
	content		VARCHAR2(4000)	NOT NULL,
	writeday	DATE			DEFAULT SYSDATE,
	readcount	NUMBER			DEFAULT 0
);

CREATE SEQUENCE j_board_seq NOCACHE;

insert into j_board(no, title, name, password, content)
values(j_board_seq.nextval, '�� �˾ƿ�', '������','1234','�� ���� �帣��');

insert into j_board(no, title, name, password, content)
values(j_board_seq.nextval, 'ȯ����� �״�', '����ö','1234','������� �״��� �Ӹ�����...');

insert into j_board(no, title, name, password, content)
values(j_board_seq.nextval, '�츮 ���� ���� ������ ��', '����ö','1234','�帥 â�� ���̷� �Ͼ��...');

select * from j_board;
