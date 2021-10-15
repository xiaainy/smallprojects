package cn.xiaainy.housingrentalsystem.service;

import cn.xiaainy.housingrentalsystem.domain.House;

/**
 * HouseService.java【业务层】
 * 定义House[],保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete])
 */
public class HouseService {
    private House[] houses;//保存House对象

    public  HouseService(int size) {
        //当创建HHouseService对象，指定数组大小
        houses =new House[size];
        //为了配合测试列表信息，这里初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }

    //list方法，返回houses
    public House[] list(){
        return houses;
    }
}
