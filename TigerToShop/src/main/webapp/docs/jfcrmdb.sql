/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : jfcrmdb

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 15/12/2017 09:53:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority`  (
  `authorId` int(11) NOT NULL COMMENT '权限ID',
  `authorName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限名',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`authorId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for chance
-- ----------------------------
DROP TABLE IF EXISTS `chance`;
CREATE TABLE `chance`  (
  `changeId` int(11) NOT NULL COMMENT '机会ID',
  `changeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '机会名称',
  `customerId` int(11) DEFAULT NULL COMMENT '客户id',
  `saleMoney` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '销售金额',
  `saleStage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '销售阶段',
  `winrate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '赢单率',
  `ownerId` int(11) DEFAULT NULL COMMENT '所有者Id',
  `createId` int(11) DEFAULT NULL COMMENT '创建者ID',
  `createDate` date DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`changeId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `CustomerId` int(11) NOT NULL COMMENT '客户ID',
  `CustomerName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'CustomerName',
  `gender` int(255) DEFAULT NULL COMMENT '性别',
  `post` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '职务',
  `birthday` date DEFAULT NULL COMMENT '出生年月 ',
  `CustomertLevel` int(255) DEFAULT NULL COMMENT '客户级别',
  `CustomerClassId` int(11) DEFAULT NULL COMMENT '客户类别ID',
  `firstContact` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '首要联系人',
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系手机',
  `industry` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户行业',
  `source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户来源',
  `nature` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司性质 ',
  `Scale` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '企业规模',
  `Address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系地址',
  `Phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系电话',
  `winxin` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '微信号',
  `nextdate` date DEFAULT NULL COMMENT '下次联系时间',
  `createId` int(11) DEFAULT NULL COMMENT '创建者',
  `createDate` date DEFAULT NULL COMMENT '创建时间',
  `lastupdate` date DEFAULT NULL COMMENT '最后一次更新时间',
  `tagLabel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标记',
  `remark` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`CustomerId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for customerclass
-- ----------------------------
DROP TABLE IF EXISTS `customerclass`;
CREATE TABLE `customerclass`  (
  `custClassId` int(11) NOT NULL COMMENT '客户类别ID',
  `custName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '客户类别名称',
  `parentId` int(11) DEFAULT NULL COMMENT '客户类别上级id',
  `sortNum` int(11) DEFAULT NULL COMMENT '序号',
  PRIMARY KEY (`custClassId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for customerfollow
-- ----------------------------
DROP TABLE IF EXISTS `customerfollow`;
CREATE TABLE `customerfollow`  (
  `followId` int(11) NOT NULL COMMENT '跟进ID',
  `context` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '跟进内容',
  `customerId` int(11) DEFAULT NULL COMMENT '客户id',
  `followMode` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '跟进方式',
  `followDate` date DEFAULT NULL COMMENT '跟进日期',
  `createId` int(11) DEFAULT NULL COMMENT '创建者ID',
  `createDate` date DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`followId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for departs
-- ----------------------------
DROP TABLE IF EXISTS `departs`;
CREATE TABLE `departs`  (
  `departId` int(11) NOT NULL COMMENT '部门ID',
  `departsName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门名称',
  `parentId` int(11) DEFAULT NULL COMMENT '父部门编号',
  `departCode` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门编码',
  `departArea` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '归属区域',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`departId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for roleandauth
-- ----------------------------
DROP TABLE IF EXISTS `roleandauth`;
CREATE TABLE `roleandauth`  (
  `roleAuthId` int(11) NOT NULL COMMENT '角色权限ID',
  `roleId` int(11) DEFAULT NULL COMMENT '角色',
  `authId` int(11) DEFAULT NULL COMMENT '权限',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`roleAuthId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `rolesId` int(11) NOT NULL COMMENT '角色ID',
  `rolesNameZh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色中文名',
  `rolesNameEn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色英文名',
  `authorId` int(11) DEFAULT NULL COMMENT '权限ID',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  INDEX `rolesId`(`rolesId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sysconfig
-- ----------------------------
DROP TABLE IF EXISTS `sysconfig`;
CREATE TABLE `sysconfig`  (
  `syscId` int(11) NOT NULL COMMENT '系统设置ID',
  `companyNameZh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司中文名称',
  `companyNameEn` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司英文名称',
  `moblie` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `fax` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '传真',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `address` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `openBank` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开户银行',
  `openAccount` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开户账号',
  `managerCount` int(255) DEFAULT NULL COMMENT '管理员数',
  `usersCount` int(255) DEFAULT NULL COMMENT '授权用户数',
  `currentCount` int(255) DEFAULT NULL COMMENT '当前用户数',
  `sysState` int(255) DEFAULT NULL COMMENT ' 系统状态',
  `apiInterface` int(255) DEFAULT NULL COMMENT 'Api接口',
  `keySecret` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '接口Secret',
  `logo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司logo',
  `website` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司网址',
  PRIMARY KEY (`syscId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `usersId` int(11) NOT NULL COMMENT '用户ID',
  `account` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `commpany` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司',
  `departId` int(11) DEFAULT NULL COMMENT '部门Id',
  `rolesId` int(11) DEFAULT NULL COMMENT '角色Id',
  `createDate` date DEFAULT NULL COMMENT '创建日期',
  `lastDate` date DEFAULT NULL COMMENT '最后一次登录日期',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  INDEX `users_rolesid`(`rolesId`) USING BTREE,
  INDEX `users_departid`(`departId`) USING BTREE,
  CONSTRAINT `users_departid` FOREIGN KEY (`departId`) REFERENCES `departs` (`departId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `users_rolesid` FOREIGN KEY (`rolesId`) REFERENCES `roles` (`rolesId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
