package com.alden.DanLi;

import org.junit.Test;

/**
 * Created by Administrator on 2020/6/10.
 */
public class EnumSingle {

    private String name;
    private String age;
    private String sex;

    //私有化构造函数
    private EnumSingle() {
    }

    //静态枚举类
    static enum singleLei {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private EnumSingle enumSingle;
        //私有化枚举的构造函数
        private singleLei(){
            enumSingle=new EnumSingle();
        }
        public EnumSingle getInstnce(){
            return enumSingle;
        }
    }

    //对外暴露一个获取User对象的静态方法
    public static EnumSingle getInstance(){
        return singleLei.INSTANCE.getInstnce();
    }



    public static void main(String [] args){
        System.out.println(EnumSingle.getInstance());
        System.out.println(EnumSingle.getInstance());
        System.out.println(EnumSingle.getInstance()==EnumSingle.getInstance());
    }

}
