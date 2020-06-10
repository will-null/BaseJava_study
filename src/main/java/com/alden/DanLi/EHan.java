package com.alden.DanLi;

//饿汉模式
public class EHan {

    /*
    * 单例的特点
    * 公有的方法获取实例，
    * 私有的构造方法，
    * 私有的成员变量。
    * */

    //没有使用的变量也会全部提前加载，容易造成资源的浪费，
    private String name;
    private String age;
    private String sex;

    private EHan() {
    }

    //对象不管用没用到，上来就会加载
    private static final EHan eHan=new EHan();

    public static EHan geteHan() {
        return eHan;
    }
}
