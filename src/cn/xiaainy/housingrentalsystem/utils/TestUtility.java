package cn.xiaainy.housingrentalsystem.utils;

public class TestUtility {
    public static void main(String[] args) {
        //这是一个测试类，使用完毕就可以删除。
        //要求输入一个字符串，长度最大为3
        System.out.println("请输入一个字符串：");
        String s = Utility.readString(3);
        System.out.println("s=" +s);

        //要求输入一个字符串，长度最大为10，如果用户直接回车，就给一个默认值xiaainy
        System.out.println("请输入一个字符串：");
        String s2 = Utility.readString(10, "xiaainy");
        System.out.println("s2=" +s2);

        //没有创建对象用对象调用方法，因为当一个方法是static时，就是一个静态方法，静态方法可以直接通过类名直接调用。
        A.cry();
    }
}

class A{
    public void hi(){

    }
    public static void cry(){

    }
}