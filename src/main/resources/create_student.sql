drop table students;
CREATE TABLE students (
stud_id int NOT NULL AUTO_INCREMENT,
first_name char(20) DEFAULT NULL,
last_name char(20) DEFAULT NULL,
roll_number int DEFAULT NULL,
date_of_birth date DEFAULT NULL,
address char(30) DEFAULT NULL,
contact_number int DEFAULT NULL,
PRIMARY KEY (stud_id));
insert into students(stud_id,first_name,last_name,roll_number,date_of_birth,address,contact_number) values (1,'Abhishek','Shukla',1234567,'1994-03-13','RKGIT',889262491);
insert into students(stud_id,first_name,last_name,roll_number,date_of_birth,address,contact_number) values (2,'Ravi','Shukla',7878765,'1989-01-05','Bangalore',805064187);
insert into students(stud_id,first_name,last_name,roll_number,date_of_birth,address,contact_number) values (3,'Shashi','Shukla',7878765,'1989-01-05','Pune',805064187);
