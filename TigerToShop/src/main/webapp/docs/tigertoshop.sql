/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : tigertoshop

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 15/12/2017 09:52:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `adminId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `islock` int(11) DEFAULT NULL COMMENT '是否禁用',
  `commpany` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '公司名称',
  `departId` int(11) DEFAULT NULL COMMENT '部门Id',
  `rolesId` int(11) DEFAULT NULL COMMENT '角色Id',
  `createDate` datetime DEFAULT NULL COMMENT '创建日期',
  `lastDate` datetime DEFAULT NULL COMMENT '最后一次登录日期',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`adminId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (2, 'xiaoqi', NULL, '草上飞', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (3, 'xiaoliu', NULL, '李小六', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (4, 'xiaoliu', NULL, 'admin', NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (5, 'zhangsan', NULL, '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (6, 'lisi', NULL, '李四', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (7, 'wangwu', NULL, '王五', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `admin` VALUES (8, 'ZHAOLIU', NULL, '赵六', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `authorId` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `authorName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限名',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`authorId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES (1, '用户管理', '001');
INSERT INTO `author` VALUES (2, '部门管理', '002');
INSERT INTO `author` VALUES (3, '商品管理', '003');
INSERT INTO `author` VALUES (4, '库存管理', '004');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goodsName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `goodsClsId` int(11) DEFAULT NULL COMMENT '分类id',
  `goodsTypeId` int(11) DEFAULT NULL COMMENT '类型ID',
  `price` decimal(10, 2) DEFAULT NULL COMMENT '销售价',
  `Stock` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '库存',
  `weight` double DEFAULT NULL COMMENT '重量',
  `brandID` int(11) DEFAULT NULL COMMENT '品牌Id',
  `grounding` int(11) DEFAULT NULL COMMENT ' 状态：上架，下架',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  PRIMARY KEY (`goodsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '电冰箱', 1, NULL, NULL, NULL, NULL, NULL, NULL, '2017-11-29 13:27:54');
INSERT INTO `goods` VALUES (2, '电视机', 1, NULL, NULL, NULL, NULL, NULL, NULL, '2017-11-29 13:28:15');

-- ----------------------------
-- Table structure for goodsclass
-- ----------------------------
DROP TABLE IF EXISTS `goodsclass`;
CREATE TABLE `goodsclass`  (
  `goodsClsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品分类ID',
  `goodsClsName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品分类名',
  `accessPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '访问路径',
  `goodsType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品类型',
  `ordersID` int(11) DEFAULT NULL COMMENT '排序ID',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`goodsClsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goodsclass
-- ----------------------------
INSERT INTO `goodsclass` VALUES (2, '家纺用品', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (3, '水果蔬菜', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (4, '学生用品', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (5, '体育用品', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (13, '测试分类', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (14, '测试分类', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (15, 'CSS分类', NULL, NULL, NULL, NULL);
INSERT INTO `goodsclass` VALUES (16, '测试123', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for goodspic
-- ----------------------------
DROP TABLE IF EXISTS `goodspic`;
CREATE TABLE `goodspic`  (
  `goodsPicId` int(11) NOT NULL COMMENT '商品图片Id',
  `goodsPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `goodsId` int(11) DEFAULT NULL COMMENT '商品Id',
  PRIMARY KEY (`goodsPicId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype`  (
  `goodsTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品类型ID',
  `goodsTypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品类型名',
  `accessPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '访问路径',
  `goodsType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品类型',
  `tempPrefix` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '分类模板前缀',
  `contextPrefix` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '内容模板前缀',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`goodsTypeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `memberId` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员ID',
  `memberName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '会员名',
  `userName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `memberPWD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '会员密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `birthday` date DEFAULT NULL COMMENT '出生年月',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机',
  `locked` int(11) DEFAULT NULL COMMENT '状态',
  `isCar` int(11) DEFAULT NULL COMMENT '是否有车',
  `income` int(11) DEFAULT NULL COMMENT '收入状况',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`memberId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (1, 'xiaozhang', '张三', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `ordersId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `ordersNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单号',
  `memberId` int(11) DEFAULT NULL COMMENT '会员编号',
  `total` decimal(10, 0) DEFAULT NULL COMMENT '合计价',
  `Orderdate` datetime DEFAULT NULL COMMENT '下单日期',
  `delivery` int(255) DEFAULT NULL COMMENT '配送方式',
  `payment` int(255) DEFAULT NULL COMMENT '支付方式',
  `orderstatus` int(255) DEFAULT NULL COMMENT '订单状态',
  `paymentstatus` int(255) DEFAULT NULL COMMENT '支付状态',
  `deliverystatus` int(255) DEFAULT NULL COMMENT '配送状态',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ordersId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, '201711290001', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for ordersdetail
-- ----------------------------
DROP TABLE IF EXISTS `ordersdetail`;
CREATE TABLE `ordersdetail`  (
  `orderDetailId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单明细ID',
  `ordersNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '订单号',
  `goodsId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品编号',
  `price` decimal(10, 0) DEFAULT NULL COMMENT '成交价',
  `goodsNum` int(11) DEFAULT NULL COMMENT '数量',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`orderDetailId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ordersdetail
-- ----------------------------
INSERT INTO `ordersdetail` VALUES (1, '201711290001', '1', 10, 5, NULL);
INSERT INTO `ordersdetail` VALUES (2, '201711290001', '2', 2000, 1, NULL);

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `rolesId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rolesNameZh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色中文名',
  `rolesNameEn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色英文名',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`rolesId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES (1, '超级管理员', 'administrators', '测试数据');
INSERT INTO `roles` VALUES (2, '仓库管理员', 'warehouse', '测试数据');
INSERT INTO `roles` VALUES (3, '销售管理员', 'Sales', '测试数据');

-- ----------------------------
-- Table structure for rolesandauthor
-- ----------------------------
DROP TABLE IF EXISTS `rolesandauthor`;
CREATE TABLE `rolesandauthor`  (
  `raId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色权限ID',
  `authorId` int(11) DEFAULT NULL COMMENT '权限ID',
  `rolesId` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`raId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of rolesandauthor
-- ----------------------------
INSERT INTO `rolesandauthor` VALUES (1, 1, 1);
INSERT INTO `rolesandauthor` VALUES (2, 2, 1);
INSERT INTO `rolesandauthor` VALUES (3, 2, 2);

SET FOREIGN_KEY_CHECKS = 1;
