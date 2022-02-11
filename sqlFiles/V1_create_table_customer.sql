CREATE DATABASE shop;


create table customers
(
    id serial PRIMARY KEY,
    name varchar(100) not null,
    email varchar(150) UNIQUE  not null,
    zip varchar(9) not null,
    PRIMARY KEY(id)
);