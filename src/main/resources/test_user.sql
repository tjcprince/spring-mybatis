/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 100110
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 100110
 File Encoding         : utf-8

 Date: 10/17/2016 15:48:15 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `test_user`
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  `user_password` varchar(50) DEFAULT NULL COMMENT '密码',
  `user_create_time` timestamp NULL DEFAULT NULL COMMENT '用户创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `test_user`
-- ----------------------------
BEGIN;
INSERT INTO `test_user` VALUES ('1', '张三', 'zhangsan', '1111111', '2016-10-11 10:10:10'), ('2', '李四', 'lisi', '1111111', '2016-10-11 11:10:10'), ('3', '王五', 'wangwu', '1111111', '2016-10-11 11:10:10'), ('4', '小白', 'xiaobai', '1111111', '2016-10-11 11:10:10'), ('5', '小红', 'xiaohong', '1111111', '2016-10-11 11:10:10'), ('6', '小明', 'xiaoming', '1111111', '2016-10-11 11:10:10');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
