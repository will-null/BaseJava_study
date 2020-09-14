package com.alden;

import org.junit.Test;

import java.util.HashMap;


public class HashMapStudy {

    @Test
    public void hashStudy() {
        HashMap<String, String> hh = new HashMap<String, String>();
        hh.put("姓名", "周瑜2");
        String now = hh.put("姓名","3");
        System.out.println(now);
        String now1 = hh.put("姓名","33");
        System.out.println(now1);
    }

    @Test
    public void wei(){
        int x=1;
        System.out.println(x++);      //1
        System.out.println(++x);      //2

        System.out.println("==================================================================================");

        /* 8*2的-2次方 ==> 8*(1/4)*/
        System.out.println(8>>>2);
        System.out.println("==================================================================================");
        /* 4*(2的2次方) */
        System.out.println(1<<30);


        System.out.println(-1 >>> 24);
    }

}
