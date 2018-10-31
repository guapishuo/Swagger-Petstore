create database swagger;
use swagger;
#������
create table `Order` (
  id  int primary key auto_increment ,#����id
  petid  int ,#����id
  quantity int,#����
  shipDate varchar(10),#��������
  `status` enum('placed','approved','delivered '),#״̬
  `complete` tinyint(1) default 0
);

#����
create table Category(
  id int,
  name varchar(10)
);

#�û���
create table `User`(
  id int,
  username varchar(10),
  firstName varchar(5),#��
  lastName varchar(5),#��
  email varchar(15),#����
  `password` varchar(20),#����
  phone varchar(15),#�绰
  `userStatus` int #״̬
);

#��ǩ��
create table Tag(
  id int,
  name varchar(10)
);

#�����
create table Pet(
  id int primary key auto_increment ,
  category varchar(10),#��������
  name varchar(10),#������
  photoUrls varchar(10),#������Ƭ
  tags int,#�����ǩ
  `status` enum('available','pending','sold')#����״̬
);

#��Ӧ��
create table ApiResponse(
  code int, #����
  `type` varchar(10),#���
  message varchar(50)#��Ϣ
)
