show databases;
create database AddressBookService;
use AddressBookService;
create table AddressBookTable(Fname varchar(10),Lname varchar(10),address varchar(100),city varchar(20),state varchar(20),zip int,phoneNum varchar(10),email varchar(20));
desc AddressBookTable;
insert into AddressBookTable values('roshan','murkar','at post sawantwadi ','sawantwadi','maharastra',416510,'7276825217','roshan@gmail.com');
select * from AddressBookTable;
insert into AddressBookTable values('prashant','murkar','at post sawantwadi ','sawantwadi','maharastra',416510,'9579827262','prashant@gmail.com');
insert into AddressBookTable values('pranali','kudtarkar','at post sangeli ','sawantwadi','maharastra',416510,'1234567890','pranali@gmail.com');
insert into AddressBookTable values('pavan','thakur','at post kudal ','kudal','maharastra',416515,'0987654321','pavan@gmail.com');
insert into AddressBookTable values('karishma','murkar','borivali dhahisar waste ','mumbai','maharastra',400500,'0990988977','karishma@gmail.com');
select * from AddressBookTable;

update AddressBookTable set phoneNum='1122334455' where Fname='roshan';
delete from AddressBookTable where Fname='roshan';

select * from AddressBookTable where city='sawantwadi';
select count(city) from AddressBookTable where city='sawantwadi' group by city;
select * from AddressBookTable order by city asc;
select * from AddressBookTable order by city desc;
alter table AddressBookTable add column type varchar(20); 

update AddressBookTable set type='family' where Fname='roshan';

select count(type) from AddressBookTable where type='family' group by type;

