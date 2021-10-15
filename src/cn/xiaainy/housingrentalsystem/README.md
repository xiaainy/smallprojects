# 房屋出租管理系统

### 房租出租程序框架图
1.系统有哪些类（文件）
2.明确类与类的调用关系

**HouseView.java**【界面】

1.显示界面

2.接收用户的输入

3.调用HouseService完成对房屋信息的各种操作。

**HouseService.java**【业务层】

1.响应HouseView的调用

2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete])

**House.java**【domain/model】

1.一个House对象表示一个房屋信息

**HoseRentApp.java**

创建HouseView对象，调用该对象，显示主菜单。





