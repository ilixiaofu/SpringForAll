CREATE TABLE student(
   id   INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(25) NOT NULL,
   age  INT NOT NULL,
   PRIMARY KEY (id)
);


/* 定义存储过程*/
use spring;

DELIMITER $$

DROP PROCEDURE IF EXISTS  spring.getStudentRecord $$
CREATE DEFINER=`root`@`%` PROCEDURE `getStudentRecord`(
IN in_id INTEGER,
OUT out_name VARCHAR(25),
OUT out_age  INTEGER)
BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM student where id = in_id;
END $$

DELIMITER ;


set @out_name = '0';
set @out_age = 0;
call spring.getStudentRecord(1, @out_name, @out_age);
select @out_name, @out_age;



/* 定义函数*/
use spring;

DELIMITER $$

DROP FUNCTION IF EXISTS `spring`.`getStudentName` $$
CREATE DEFINER=`root`@`%` FUNCTION `getStudentName`(in_id INTEGER) RETURNS varchar(25) CHARSET utf8
BEGIN
DECLARE out_name VARCHAR(25);
   SELECT name
   INTO out_name
   FROM student where id = in_id;

RETURN out_name;
END $$

DELIMITER ;

