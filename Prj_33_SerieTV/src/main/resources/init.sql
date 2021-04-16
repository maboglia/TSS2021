drop table if exists genere;

create table genere (

	id int not null AUTO_INCREMENT,
	genere varchar(25),
	PRIMARY KEY (id)

);

insert into `genere` (`genere`.`genere`) values ('drama');
insert into `genere` (`genere`.`genere`) values ('comedy');
insert into `genere` (`genere`.`genere`) values ('thriller');

