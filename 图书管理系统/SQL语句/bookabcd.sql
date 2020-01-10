/*
Navicat MySQL Data Transfer

Source Host           : localhost:3306
Source Database       : bookabcd

Date: 2020-01-10 15:48:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `ID` varchar(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishedHouse` varchar(255) DEFAULT NULL,
  `typel` varchar(255) DEFAULT NULL,
  `place` varchar(255) DEFAULT NULL,
  `datel` varchar(255) DEFAULT NULL,
  `bookStatus` varchar(255) DEFAULT NULL,
  `borrowPeopleName` varchar(255) DEFAULT NULL,
  `numberl` varchar(255) DEFAULT NULL,
  `borrowDate` varchar(255) DEFAULT NULL,
  `backTime` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sname` varchar(255) DEFAULT NULL,
  `snumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for studentbackmessage
-- ----------------------------
DROP TABLE IF EXISTS `studentbackmessage`;
CREATE TABLE `studentbackmessage` (
  `ID` varchar(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishedHouse` varchar(255) DEFAULT NULL,
  `typel` varchar(255) DEFAULT NULL,
  `datel` varchar(255) DEFAULT NULL,
  `borrowPeopleName` varchar(255) DEFAULT NULL,
  `numberl` varchar(255) DEFAULT NULL,
  `borrowDate` varchar(255) DEFAULT NULL,
  `backTime` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for studentborrowmessage
-- ----------------------------
DROP TABLE IF EXISTS `studentborrowmessage`;
CREATE TABLE `studentborrowmessage` (
  `ID` varchar(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishedHouse` varchar(255) DEFAULT NULL,
  `typel` varchar(255) DEFAULT NULL,
  `datel` varchar(255) DEFAULT NULL,
  `borrowPeopleName` varchar(255) DEFAULT NULL,
  `numberl` varchar(255) DEFAULT NULL,
  `borrowDate` varchar(255) DEFAULT NULL,
  `backTime` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tname` varchar(255) DEFAULT NULL,
  `tnumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for teacherbackmessage
-- ----------------------------
DROP TABLE IF EXISTS `teacherbackmessage`;
CREATE TABLE `teacherbackmessage` (
  `ID` varchar(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishedHouse` varchar(255) DEFAULT NULL,
  `typel` varchar(255) DEFAULT NULL,
  `datel` varchar(255) DEFAULT NULL,
  `borrowPeopleName` varchar(255) DEFAULT NULL,
  `numberl` varchar(255) DEFAULT NULL,
  `borrowDate` varchar(255) DEFAULT NULL,
  `backTime` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for teacherborrowmessage
-- ----------------------------
DROP TABLE IF EXISTS `teacherborrowmessage`;
CREATE TABLE `teacherborrowmessage` (
  `ID` varchar(255) DEFAULT NULL,
  `bname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publishedHouse` varchar(255) DEFAULT NULL,
  `typel` varchar(255) DEFAULT NULL,
  `datel` varchar(255) DEFAULT NULL,
  `borrowPeopleName` varchar(255) DEFAULT NULL,
  `numberl` varchar(255) DEFAULT NULL,
  `borrowDate` varchar(255) DEFAULT NULL,
  `backTime` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
