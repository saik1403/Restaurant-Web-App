
create database Restaurant;

use Restaurant;

create table users
 ( userid int,
 username varchar(20), 
 userpassword varchar(20)
);

create table admins
 ( adminid int,
 adminname varchar(20), 
 adminpassword varchar(20)
);

create table Bills
(
              BillId  int NOT NULL AUTO_INCREMENT Primary key,
              BillDate Date,
              ItemId int,
              TotalPrice int,
              Userid int,
              Username Varchar(20)
          );

insert into users values (301,'Sai','Sai');
insert into users values(302,'Anmol','Anmol');
insert into users values(303,'Pallavi','Pallavi');
select * from users;

insert into admins values(101,'Saikiran','Saikiran');

select * from admins;

create table menu
 ( ItemId int,
  ItemName varchar(20), 
  ItemPrice int
);
insert into menu values (1,'Iddly',20);
insert into menu values(2,'Biryani',200);
insert into menu values(3,'Tea',10);
insert into menu values (4,'Uppma',30);
insert into menu values (5,'VegThali',100);
insert into menu values (6,'NonVegThali',200);
select * from menu;

insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values (curdate(),1,20,301,'Saikiran');
insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values ('2021-08-06',2,200,301,'Sai');
insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values ('2021-08-06',3,20,302,'Anmol');
insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values ('2021-08-05',6,200,303,'Pallavi');
insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values ('2021-07-05',4,30,303,'Pallavi');
insert into Bills (BillDate,ItemId,TotalPrice,Userid,Username) values ('2021-07-05',2,200,302,'Anmol');
select * from Bills;
