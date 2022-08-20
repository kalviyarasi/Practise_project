CREATE DATABASE fwa;
use fwa;
create table admin(
	email varchar(40),
    password varchar(15) 
	);
    
create table airline(
    id bigint(20) not null,
    name varchar(20) 
    );
    
show tables;
create table user(
      email varchar(20) not null,
      password varchar(20) not null,
      name varchar(20) not null,
      phno bigint(20) not null,
      adno bigint(20) 
    );
create table flights(
	name varchar(20) not null,
    fromf varchar(20) not null,
    tof varchar(20) not null,
    datef varchar(20) not null,
    timef varchar(20) not null,
    price bigint(20),
    ID bigint(20) not null
   );

insert admin(email,password) values("admin@gmail.com","admin");
   
insert airline(id , name) values(87653,"Air India Express"),(45678,"Air India"),(98658,"Jet Airways"),(87654,"Jet Airways");
   
insert into flights( name, fromf, tof, datef, timef, price, id) values
   ("Air India Express", "bangalore" ,"mumbai" ,"15-08-2022"  ,"3:00-4:00",7500,87653),
   ("Air India " , "chennai","cochin" ,"15-08-2022" ,"5:00-7:00",5500,45678),
   ("Jet Airways", "dalas","california","15-08-2022","7:00-9:00",26500,98658),
   ("Vistara", "las vegas" ,"neyyork","15-08-2022","8:00-10:00",36500,87654);
   
   select * from flights;
   select * from user;
   select * from admin;
   select * from airline;