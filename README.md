项目基于Spring Boot 3.2.1框架，JDK版本为21，
利用JDDBC与数据库进行交互，添加了thymeleaf模板，用于渲染页面，
Validation进行了数据的验证。

主要功能：
1、index页面登录、注册账号。
2、LibraryHomepage页面展示图书信息
3、LibrarySearchpage页面展示图书详细信息，可以进行搜索、删除、编辑图书、借阅图书。
4、LibraryAddpage页面，与编辑页面进行复用，可以进行添加图书。（页面有隐藏表单，与编辑页面复用的同时，传递的数据不同，不会造成数据库冲突）
5、LibraryUserinfo查看用户的信息，查看借阅的数量、是否是vip、最大借阅图书。

数据库创建了四种表：
bookdetails: 存储每本书的详细信息。
bookinfo: 存储每种书籍的汇总信息。
login: 存储登录信息。
users: 存储用户信息
bookdetails 与 bookinfo 通过 book_info_id 字段关联，表示每本书都对应一个书籍汇总记录。
users 与 login 通过 login_id 字段关联，表示每个用户都有一个登录记录。

代码已上传github：https://github.com/Cxpppyyy/LibraryManageSystem
