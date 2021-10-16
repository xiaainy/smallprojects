# 房屋出租管理系统

### 房租出租程序框架图
1.系统有哪些类（文件）
2.明确类与类的调用关系

**HouseView.java**【界面】

1.显示界面

2.接收用户的输入

3.调用HouseService完成对房屋信息的各种操作。



**HouseService.java**【业务层】

定义House[],保存House对象

1.响应HouseView的调用

2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete])



**House.java**【domain/model】

1.一个House对象表示一个房屋信息

2.House类有6个属性：编号、房主、电话、地址、房租、状态（未出租/已出租）。



**HoseRentApp.java**

创建HouseView对象，调用该对象，显示主菜单。



### 房屋出租系统-实现

准备工具类Utility,提高开发效率

在实际开发中，公司都会提供相应的工具类，可以提高开发效率，程序员也需要能够看懂别人的代码，并能够正确的调用。

1.了解Utility类

2.测试Utility类



**分层模式**

![程序框架图](https://qiniu.xiaainy.cn/img/%E9%9F%A9%E9%A1%BA%E5%B9%B3_%E5%BE%AA%E5%BA%8F%E6%B8%90%E8%BF%9B%E5%AD%A6Java%E9%9B%B6%E5%9F%BA%E7%A1%80%E3%80%90%E5%AE%8C%E6%95%B4%E7%AC%94%E8%AE%B0%E3%80%91.jpg)



