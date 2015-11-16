/*
Navicat MySQL Data Transfer

Source Server         : XAMPP
Source Server Version : 50611
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2015-11-16 15:23:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `age` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '哈哈', '20');
INSERT INTO `user` VALUES ('10', '小青', '34');
INSERT INTO `user` VALUES ('11', '小黑', '23');
INSERT INTO `user` VALUES ('2', '呵呵', '12');
INSERT INTO `user` VALUES ('3', '嘿嘿', '20');
INSERT INTO `user` VALUES ('4', '吼吼', '12');
INSERT INTO `user` VALUES ('5', '啦啦', '25');
INSERT INTO `user` VALUES ('7', '小红', '12');
INSERT INTO `user` VALUES ('8', '小强', '14');
INSERT INTO `user` VALUES ('9', '小白', '17');
