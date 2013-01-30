/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.20 : Database - sysnc_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sysnc_system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sysnc_system`;

/*Table structure for table `syn_account` */

DROP TABLE IF EXISTS `syn_account`;

CREATE TABLE `syn_account` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `purview` int(1) DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `syn_account_sell` */

DROP TABLE IF EXISTS `syn_account_sell`;

CREATE TABLE `syn_account_sell` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `goods_id` varchar(255) DEFAULT NULL,
  `total` int(5) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `syn_account_store` */

DROP TABLE IF EXISTS `syn_account_store`;

CREATE TABLE `syn_account_store` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account_id` int(10) DEFAULT NULL,
  `store_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `syn_goods` */

DROP TABLE IF EXISTS `syn_goods`;

CREATE TABLE `syn_goods` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL COMMENT '商品标题',
  `link` varchar(255) DEFAULT NULL COMMENT '淘宝地址',
  `key` varchar(255) DEFAULT NULL COMMENT '关键字',
  `store_id` int(10) DEFAULT NULL COMMENT '店铺ID',
  `update_at` datetime DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `stock` int(10) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `syn_store` */

DROP TABLE IF EXISTS `syn_store`;

CREATE TABLE `syn_store` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
