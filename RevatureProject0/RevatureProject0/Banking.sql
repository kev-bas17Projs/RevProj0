create table if not exists users(
first_name varchar(30) not null,
last_name varchar(30) not null,
--email varchar(50) not null unique,
username varchar(64) not null unique,
password varchar(50) not null,
account_num int not null,
balance int not null
);

create table if not exists account(
account_num int primary key not null,
balance int not null
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


--Inserting into users (first_name, last_name, username, password)--
insert into users(first_name, last_name, username, password, account_num, balance)
values ('Keith','Marshall','KMarsh96', 'KeithMarsh1996', 234509, 4560),
('Salome','Best','salisthebest428', 'BeTheBest1988', 604427, 3400),
('John','Taylor','JTLune', 'JoTay@1276', 567009, 7133),
('Evette','Sanchez','EveSanch0', 'EveeeeeeSnacheez1023', 883344, 1857), 
('Luiz','Russino','GangstaLui189', 'LuiRussi&Cino97', 301247, 9230);

-- Inserting into account (accountNum, balance) --
insert into account(account_num, balance) 
values (234509, 4560),
(604427, 3400),
(567009, 7133),
(883344, 1857),
(301247, 9230);


-- Inserting into "transaction" (senderID, senderAccountNum, senderFirstName, senderLastName, senderUsername, recepientID, recepientAccountNum, recepientFirstName, recepientLastName, recepientUsername) --



--select * from users;
--select users.first_name, users.last_name, users.username, users.password, account.account_num, account.balance from users,account;
--select balance from account;
drop table account ;
create table if not exists account(account_num int primary key not null, balance int not null);

insert into account(account_num, balance) 
values 
(234509, 4560),
(064427, 3400),
(567009, 7133),
(883344, 1857),
(301247, 9230);

--select * from account;

--select users.first_name, users.last_name, users.username, users.password, account.account_num, account.balance from users,account;

drop table users;
create table if not exists users(
first_name varchar(30) not null,
last_name varchar(30) not null,
--email varchar(50) not null unique,
username varchar(64) not null unique,
password varchar(50) not null,
account_num int not null,
balance int not null
);

insert into users(first_name, last_name, username, password, account_num, balance)
values ('Keith','Marshall','KMarsh96', 'KeithMarsh1996', 234509, 4560),
('Salome','Best','salisthebest428', 'BeTheBest1988', 604427, 3400),
('John','Taylor','JTLune', 'JoTay@1276', 567009, 7133),
('Evette','Sanchez','EveSanch0', 'EveeeeeeSnacheez1023', 883344, 1857), 
('Luiz','Russino','GangstaLui189', 'LuiRussi&Cino97', 301247, 9230);




select * from users;  
--select * from account;

--select users.first_name, users.last_name, users.username from users inner join account on users.account_num = account.account_num; 
--select users.first_name, users.last_name, users.username, account.account_num, account.balance from users inner join account on username.account = account_num.account; 

