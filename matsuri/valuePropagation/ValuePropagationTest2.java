package com.matsuri.valuePropagation;

/**
 * Created by Matsuri on 2022/7/22 - 22:32
 */

public class ValuePropagationTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ", n = " + data.n);


        //交换m、n的值
//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;
        ValuePropagationTest2 test2 = new ValuePropagationTest2();
        test2.swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m;
    int n;
}
