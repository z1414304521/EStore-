create table e_product(
	id number primary key,
	name varchar2(200),
	price number(8,2)
);
create table e_customer(
	id number primary key,
	name varchar2(20),
	password varchar2(20),
	zip varchar2(20),
	address varchar2(50),
	telephone varchar2(20),
	email varchar2(30)
);
create table e_orderform(
	id number primary key,
    	cost number(8,2),
	orderdate date,
    	customerid number references e_customer(id)
);
create table e_orderline(
	id number primary key,
	num number not null,
	orderid references e_orderform(id),	
	bookid references e_product(id)
);



insert into e_product values(1,'JAVA核心技术',81.00);
insert into e_product values(2,'UNIX技术手册',21.15);
insert into e_product values(3,'ORACLE9I参考手册',108.00);
insert into e_product values(4,'JSP设计(第三版)',59.25);
insert into e_product values(5,'JAVA SERVLET 编程(第二版)',38.25);
insert into e_product values(6,'XML 高级编程(第2版)',97.20);
insert into e_product values(7,'精通STRUTS:基于MVC的JAVA WEB设计与开发',36.75);
insert into e_product values(8,'精通HIBERNATE：JAVA对象持久化技术详解',44.25);
insert into e_product values(9,'SPRING IN ACTION中文版',29.25);
insert into e_product values(10,'精通EJB 3.0',44.25);



create sequence e_product_seq start with 1 increment by 1;
create sequence e_customer_seq start with 1 increment by 1;
create sequence e_orderform_seq start with 1 increment by 1;
create sequence e_orderline_seq start with 1 increment by 1;


