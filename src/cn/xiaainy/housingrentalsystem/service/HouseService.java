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
    private int housesNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id自增长到那个值了

    public  HouseService(int size) {
        //当创建HHouseService对象，指定数组大小
        houses =new House[size];
        //为了配合测试列表信息，这里初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加（暂时不考虑数组扩容的问题）
        if (housesNums == houses.length){//不能再添加
            System.out.println("数组已满，不能再添加了.....");
            return false;
        }
        //把newHouse对象加入到,新增加了一个房屋
        houses[housesNums++] = newHouse;
        //需要设计一个id自增长的机制
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法，返回houses
    public House[] list(){
        return houses;
    }
}
