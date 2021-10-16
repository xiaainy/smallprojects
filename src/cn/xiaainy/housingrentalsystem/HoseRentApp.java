package cn.xiaainy.housingrentalsystem;

import cn.xiaainy.housingrentalsystem.view.HouseView;

public class HoseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mianView();
        System.out.println("===你退出房屋出租系统===");

    }
}
