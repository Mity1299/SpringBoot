/*
Navicat MySQL Data Transfer

Source Server         : junitTest
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : junitdb

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-05-26 12:10:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', 'Beijing', '13021121299', '807798223@qq.com');
INSERT INTO `house` VALUES ('2', 'Guangdong', '13021121299', '807798223@qq.com');
INSERT INTO `house` VALUES ('3', 'Xian', '13021121122', '8080@qq.com');
INSERT INTO `house` VALUES ('4', 'Henan', '13021121122', '8080@qq.com');
INSERT INTO `house` VALUES ('5', 'Beijing', '13021121122', '8080@qq.com');
INSERT INTO `house` VALUES ('6', 'Beijing', '13021121122', '8080@qq.com');
INSERT INTO `house` VALUES ('7', 'Beijing', '13021121122', '8080@qq.com');
INSERT INTO `house` VALUES ('8', 'Beijing', '13021121299', '8080@qq.com');
INSERT INTO `house` VALUES ('9', 'Beijing', '13021121299', '8080@qq.com');
INSERT INTO `house` VALUES ('10', 'Beijing', '13021121299', '8080@qq.com');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'user1', '1');
INSERT INTO `user` VALUES ('2', 'user2', '2');
INSERT INTO `user` VALUES ('3', 'user3', '3');
INSERT INTO `user` VALUES ('28', 'monika', '0');
INSERT INTO `user` VALUES ('29', 'monika', '0');
INSERT INTO `user` VALUES ('30', 'monika', '0');
INSERT INTO `user` VALUES ('31', 'monika', '0');
INSERT INTO `user` VALUES ('32', 'monika', '0');
INSERT INTO `user` VALUES ('33', 'monika', '0');
INSERT INTO `user` VALUES ('34', 'monika', '0');
INSERT INTO `user` VALUES ('35', 'monika', '0');
INSERT INTO `user` VALUES ('36', 'monika', '0');
