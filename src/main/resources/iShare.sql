CREATE DATABASE iShare;

create table user
(
	id int auto_increment
		primary key,
	username varchar(45) not null,
	password varchar(45) not null
);
