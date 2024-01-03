use user;

drop table admin;

create table admin(
	admin_id varchar(20) primary key,
	password varchar(20) not null,
	name varchar(20) not null
);

insert into admin (admin_id, password, name) values("root", "0000", "root");

select * from admin;