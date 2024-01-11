/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 12/01/2024 01:55:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bookdetails
-- ----------------------------
DROP TABLE IF EXISTS `bookdetails`;
CREATE TABLE `bookdetails`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `publisher` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `publication_date` date NOT NULL,
  `is_borrowed` tinyint(1) NULL DEFAULT NULL,
  `borrower_id` int(11) NULL DEFAULT NULL,
  `start_date` date NULL DEFAULT NULL,
  `due_date` date NULL DEFAULT NULL,
  `book_info_id` int(11) NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE,
  INDEX `book_info_id`(`book_info_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 42 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bookdetails
-- ----------------------------
INSERT INTO `bookdetails` VALUES (1, '生活无法', '海创信息有限公司', '2017-04-10', 0, NULL, NULL, NULL, 1);
INSERT INTO `bookdetails` VALUES (2, '生活无法', '海创信息有限公司', '2017-04-10', 0, NULL, NULL, NULL, 1);
INSERT INTO `bookdetails` VALUES (3, '生活无法', '海创信息有限公司', '2017-04-10', 0, NULL, NULL, NULL, 1);
INSERT INTO `bookdetails` VALUES (4, '继续日期', '盟新科技有限公司', '2020-11-04', 0, NULL, NULL, NULL, 2);
INSERT INTO `bookdetails` VALUES (5, '继续日期', '盟新科技有限公司', '2020-11-04', 0, NULL, NULL, NULL, 2);
INSERT INTO `bookdetails` VALUES (6, '继续日期', '盟新科技有限公司', '2020-11-04', 0, NULL, NULL, NULL, 2);
INSERT INTO `bookdetails` VALUES (7, '继续日期', '盟新科技有限公司', '2020-11-04', 0, NULL, NULL, NULL, 2);
INSERT INTO `bookdetails` VALUES (8, '朋友安全', '万迅电脑传媒有限公司', '2014-04-21', 1, NULL, NULL, NULL, 3);
INSERT INTO `bookdetails` VALUES (9, '朋友安全', '万迅电脑传媒有限公司', '2014-04-21', 0, NULL, NULL, NULL, 3);
INSERT INTO `bookdetails` VALUES (10, '朋友安全', '万迅电脑传媒有限公司', '2014-04-21', 0, NULL, NULL, NULL, 3);
INSERT INTO `bookdetails` VALUES (11, '朋友安全', '万迅电脑传媒有限公司', '2014-04-21', 0, NULL, NULL, NULL, 3);
INSERT INTO `bookdetails` VALUES (12, '发展注册', '四通科技有限公司', '2020-02-14', 0, NULL, NULL, NULL, 4);
INSERT INTO `bookdetails` VALUES (13, '发展注册', '四通科技有限公司', '2020-02-14', 0, NULL, NULL, NULL, 4);
INSERT INTO `bookdetails` VALUES (14, '发展注册', '四通科技有限公司', '2020-02-14', 0, NULL, NULL, NULL, 4);
INSERT INTO `bookdetails` VALUES (15, '发展注册', '四通科技有限公司', '2020-02-14', 0, NULL, NULL, NULL, 4);
INSERT INTO `bookdetails` VALUES (16, '发展注册', '四通科技有限公司', '2020-02-14', 0, NULL, NULL, NULL, 4);
INSERT INTO `bookdetails` VALUES (17, '开始地址', '鸿睿思博传媒有限公司', '2023-08-07', 1, NULL, NULL, NULL, 5);
INSERT INTO `bookdetails` VALUES (18, '开始地址', '鸿睿思博传媒有限公司', '2023-08-07', 1, NULL, NULL, NULL, 5);
INSERT INTO `bookdetails` VALUES (19, '开始地址', '鸿睿思博传媒有限公司', '2023-08-07', 1, NULL, NULL, NULL, 5);
INSERT INTO `bookdetails` VALUES (20, '开始地址', '鸿睿思博传媒有限公司', '2023-08-07', 0, NULL, NULL, NULL, 5);
INSERT INTO `bookdetails` VALUES (21, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 1, NULL, NULL, NULL, 6);
INSERT INTO `bookdetails` VALUES (22, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 1, NULL, NULL, NULL, 6);
INSERT INTO `bookdetails` VALUES (23, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 1, NULL, NULL, NULL, 6);
INSERT INTO `bookdetails` VALUES (24, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 0, NULL, NULL, NULL, 6);
INSERT INTO `bookdetails` VALUES (25, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 0, NULL, NULL, NULL, 6);
INSERT INTO `bookdetails` VALUES (26, '你们个人', '华远软件传媒有限公司', '2021-09-11', 1, NULL, NULL, NULL, 7);
INSERT INTO `bookdetails` VALUES (27, '你们个人', '华远软件传媒有限公司', '2021-09-11', 1, NULL, NULL, NULL, 7);
INSERT INTO `bookdetails` VALUES (28, '你们个人', '华远软件传媒有限公司', '2021-09-11', 1, NULL, NULL, NULL, 7);
INSERT INTO `bookdetails` VALUES (29, '你们个人', '华远软件传媒有限公司', '2021-09-11', 0, NULL, NULL, NULL, 7);
INSERT INTO `bookdetails` VALUES (30, '你们个人', '华远软件传媒有限公司', '2021-09-11', 0, NULL, NULL, NULL, 7);
INSERT INTO `bookdetails` VALUES (31, '类别不是', '创汇科技有限公司', '2023-05-15', 1, NULL, NULL, NULL, 8);
INSERT INTO `bookdetails` VALUES (32, '类别不是', '创汇科技有限公司', '2023-05-15', 0, NULL, NULL, NULL, 8);
INSERT INTO `bookdetails` VALUES (33, '类别不是', '创汇科技有限公司', '2023-05-15', 0, NULL, NULL, NULL, 8);
INSERT INTO `bookdetails` VALUES (34, '工程特别', '网新恒天网络有限公司', '2023-08-03', 1, NULL, NULL, NULL, 9);
INSERT INTO `bookdetails` VALUES (35, '工程特别', '网新恒天网络有限公司', '2023-08-03', 0, NULL, NULL, NULL, 9);
INSERT INTO `bookdetails` VALUES (36, '工程特别', '网新恒天网络有限公司', '2023-08-03', 0, NULL, NULL, NULL, 9);
INSERT INTO `bookdetails` VALUES (37, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 1, NULL, NULL, NULL, 10);
INSERT INTO `bookdetails` VALUES (38, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 0, NULL, NULL, NULL, 10);
INSERT INTO `bookdetails` VALUES (39, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 0, NULL, NULL, NULL, 10);
INSERT INTO `bookdetails` VALUES (40, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 0, NULL, NULL, NULL, 10);
INSERT INTO `bookdetails` VALUES (41, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 0, NULL, NULL, NULL, 10);

-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo`;
CREATE TABLE `bookinfo`  (
  `book_info_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `publisher` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `publication_date` date NOT NULL,
  `total_stock` int(11) NOT NULL,
  `available_books` int(11) NOT NULL,
  PRIMARY KEY (`book_info_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo` VALUES (1, '生活无法', '海创信息有限公司', '2017-04-10', 3, 3);
INSERT INTO `bookinfo` VALUES (2, '继续日期', '盟新科技有限公司', '2020-11-04', 4, 4);
INSERT INTO `bookinfo` VALUES (3, '朋友安全', '万迅电脑传媒有限公司', '2014-04-21', 4, 3);
INSERT INTO `bookinfo` VALUES (4, '发展注册', '四通科技有限公司', '2020-02-14', 5, 5);
INSERT INTO `bookinfo` VALUES (5, '开始地址', '鸿睿思博传媒有限公司', '2023-08-07', 4, 1);
INSERT INTO `bookinfo` VALUES (6, '电子不能', '菊风公司传媒有限公司', '2022-08-05', 5, 2);
INSERT INTO `bookinfo` VALUES (7, '你们个人', '华远软件传媒有限公司', '2021-09-11', 5, 2);
INSERT INTO `bookinfo` VALUES (8, '类别不是', '创汇科技有限公司', '2023-05-15', 3, 2);
INSERT INTO `bookinfo` VALUES (9, '工程特别', '网新恒天网络有限公司', '2023-08-03', 3, 2);
INSERT INTO `bookinfo` VALUES (10, '一定下载', '浙大万朋信息有限公司', '2015-05-12', 5, 4);

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`  (
  `login_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `login_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `login_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`login_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES (1, 'test1', 'test1', 'test1@qq.com');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `max_books_borrowed` int(11) NOT NULL DEFAULT 50,
  `books_borrowed` int(11) NOT NULL DEFAULT 0,
  `is_vip` tinyint(1) NOT NULL DEFAULT 0,
  `overdue_books` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Procedure structure for PopulateBookDetails
-- ----------------------------
DROP PROCEDURE IF EXISTS `PopulateBookDetails`;
delimiter ;;
CREATE PROCEDURE `PopulateBookDetails`()
BEGIN
    DECLARE finished INTEGER DEFAULT 0;
    DECLARE b_id INT;
    DECLARE b_name VARCHAR(255);
    DECLARE b_publisher VARCHAR(255);
    DECLARE b_pub_date DATE;
    DECLARE b_total_stock INT;
    DECLARE b_available_books INT;
    DECLARE cur1 CURSOR FOR SELECT book_info_id, book_name, publisher, publication_date, total_stock, available_books FROM bookinfo;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;

    OPEN cur1;

    read_loop: LOOP
        FETCH cur1 INTO b_id, b_name, b_publisher, b_pub_date, b_total_stock, b_available_books;
        IF finished = 1 THEN 
            LEAVE read_loop;
        END IF;

        SET @i = 0;
        WHILE @i < b_total_stock DO
            IF @i < b_total_stock - b_available_books THEN
                -- 标记为已借阅
                INSERT INTO bookdetails (book_name, publisher, publication_date, book_info_id, is_borrowed) VALUES (b_name, b_publisher, b_pub_date, b_id, 1);
            ELSE
                -- 标记为未借阅
                INSERT INTO bookdetails (book_name, publisher, publication_date, book_info_id, is_borrowed) VALUES (b_name, b_publisher, b_pub_date, b_id, 0);
            END IF;
            SET @i = @i + 1;
        END WHILE;
    END LOOP;

    CLOSE cur1;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
