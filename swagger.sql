create database swagger;
use swagger;
#订单表
create table `Order` (
  id  int primary key auto_increment ,#订单id
  petid  int ,#宠物id
  quantity int,#货量
  shipDate varchar(10),#运送日期
  `status` enum('placed','approved','delivered '),#状态
  `complete` tinyint(1) default 0
);

#类别表
create table Category(
  id int,
  name varchar(10)
);

#用户表
create table `User`(
  id int,
  username varchar(10),
  firstName varchar(5),#名
  lastName varchar(5),#姓
  email varchar(15),#邮箱
  `password` varchar(20),#密码
  phone varchar(15),#电话
  `userStatus` int #状态
);

#标签表
create table Tag(
  id int,
  name varchar(10)
);

#宠物表
create table Pet(
  id int primary key auto_increment ,
  category varchar(10),#宠物种类
  name varchar(10),#宠物名
  photoUrls varchar(10),#宠物照片
  tags int,#宠物标签
  `status` enum('available','pending','sold')#宠物状态
);

#响应表
create table ApiResponse(
  code int, #代码
  `type` varchar(10),#类别
  message varchar(50)#消息
)
