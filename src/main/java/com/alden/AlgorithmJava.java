package com.alden;

import org.junit.Test;

/**
 * Created by Administrator on 2020/6/10.
 */
public class AlgorithmJava {

    /**
     * 兔子问题
     * 斐波那契数列求值
     * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
     */
    @Test
    public void tu() {
        //上上月兔子对总数
        int f1 = 1;
        //上月兔子对总数
        int f2 = 1;
        int f;
        for (int i = 3; i <= 12; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.println("第" + i + "个月的兔子对数：" + f2);
        }
        /////////////////////////////////////////////////////////////////////////
        for(int i=1;i<=12;i++){

            if(i%3==0){

            }

        }
    }

}
