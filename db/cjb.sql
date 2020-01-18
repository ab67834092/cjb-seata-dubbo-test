/*
 Navicat Premium Data Transfer

 Source Server         : 我本地的
 Source Server Type    : MySQL
 Source Server Version : 50629
 Source Host           : localhost:3306
 Source Schema         : cjb

 Target Server Type    : MySQL
 Target Server Version : 50629
 File Encoding         : 65001

 Date: 03/01/2020 18:01:42
*/

drop database if exists `seata-test`;
CREATE DATABASE `seata-test` DEFAULT CHARACTER SET utf8mb4;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

use `seata-test`;

-- ----------------------------
-- Table structure for seata_business_t
-- ----------------------------
DROP TABLE IF EXISTS `seata_business_t`;
CREATE TABLE `seata_business_t`  (
  `id` int(11) NOT NULL,
  `business_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for seata_order_t
-- ----------------------------
DROP TABLE IF EXISTS `seata_order_t`;
CREATE TABLE `seata_order_t`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for seata_warehouse_t
-- ----------------------------
DROP TABLE IF EXISTS `seata_warehouse_t`;
CREATE TABLE `seata_warehouse_t`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

INSERT INTO `seata_warehouse_t` VALUES ('1', 10000);

-- ----------------------------
-- Table structure for undo_log
-- 注意此处0.3.0+ 增加唯一索引 ux_undo_log
-- ----------------------------
DROP TABLE IF EXISTS `undo_log`;
CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `context` varchar(128) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
