package com.matsuri.oop;

/**
 * Created by Matsuri on 2022/6/27 -- 17:18
 */

public class InstanceTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.sendEmail();
        phone.playGame();
        System.out.println();

        /*
          匿名对象
            1. 理解: 我们创建的对象, 没有显示的赋给一个变量名. 即为匿名对象.
            2. 特征: 匿名对象只能调用一次.
            3. 使用: 如下
         */
        PhoneMall mall = new PhoneMall();
        mall.showMall(new Phone());
        System.out.println();
        //***********************************************

        new Phone().sendEmail();
        new Phone().playGame();

        System.out.println();

        new Phone().price = 1999;
        new Phone().showPrice();
    }
}

class PhoneMall{
    public void showMall(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件.");
    }

    public void playGame(){
        System.out.println("打游戏.");
    }

    public void showPrice(){
        System.out.println("手机价格为: " + price);
    }
}
