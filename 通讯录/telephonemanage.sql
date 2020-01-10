/*
Navicat MySQL Data Transfer

Source Server         : MySQL57
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : telephonemanage

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-01-10 14:13:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for telephonedate
-- ----------------------------
DROP TABLE IF EXISTS `telephonedate`;
CREATE TABLE `telephonedate` (
  `name` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `postalCode` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `homePhone` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
