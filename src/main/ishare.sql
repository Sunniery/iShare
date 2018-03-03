/* create database */
 CREATE DATABASE ishare;

/* create table t_user */
CREATE TABLE t_user(
  id int PRIMARY KEY AUTO_INCREMENT,
  userName VARCHAR(18),
  password VARCHAR(20)
);
