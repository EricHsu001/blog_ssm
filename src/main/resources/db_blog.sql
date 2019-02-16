DROP DATABASE IF EXISTS db_blog;
/*创建数据库，并设置编码*/
CREATE DATABASE db_blog DEFAULT CHARACTER SET utf8;

USE db_blog;

CREATE TABLE `t_blogger` (
                           `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '博主id',
                           `username` VARCHAR(50) NOT NULL COMMENT '博主姓名',
                           `password` VARCHAR(100) NOT NULL COMMENT '博主密码',
                           `profile` TEXT COMMENT '博主信息',
                           `nickname` VARCHAR(50) DEFAULT NULL COMMENT '博主昵称',
                           `sign` VARCHAR(100) DEFAULT NULL COMMENT '博主签名',
                           `imagename` VARCHAR(100) DEFAULT NULL COMMENT '博主头像路径',
                           PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
