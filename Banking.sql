create table if not exists users(
first_name varchar(30) not null,
last_name varchar(30) not null,
--email varchar(50) not null unique,
username varchar(64) not null unique,
password varchar(50) not null
);

create table if not exists account(
accountNum int primary key,
balance double
);

create table if not exists transaction(
transactionID int primary key,

senderID int, 
senderAccountNum int,
senderFirstName varchar(30) not null,
senderLastName varchar(30) not null,
senderUsername varchar(30) not null,

recepientID int,
recepientAccountNum int,
recepientFirstName varchar(30) not null,
recepientLastName varchar(30) not null,
recepientUsername varchar(30) not null
);



