package com.alden.DanLi;

//懒汉模式
public class LanHan {

    private static boolean flag=false;

    private LanHan() throws Exception {
        synchronized (LanHan.class){
            if(flag==false){
                flag=true;
            }else {
                throw new Exception("别想用反射破坏单例！");
            }
        }
    }

    //volatile关键字 可以使lanHan=new LanHan(); 具备原子性，一旦线程出错，此对象将不会创建
    private volatile static  LanHan lanHan;

    //需要使用的时候，再加载对象
    //多线程的情况下，会出现问题，所以加双重锁
    public static LanHan getLanHan() {
        if(lanHan==null){
            //锁住对象
            synchronized (LanHan.class){
                if(lanHan==null){
                //    lanHan=new LanHan();
                    /*
                    lanHan对象的产生过程
                    * 1.分配内存空间
                    * 2.执行构造方法，初始化对象
                    * 3.把对象指向这个空间
                    * */
                }
            }
        }
        return lanHan;
    }

    public static void main(String[] args){
        for(int i=1;i<10;i++){
            //Lambda表达式
            new Thread(()->{
                LanHan.getLanHan();
            }).start();
        }
    }
}
