package com.matsuri.overLoad;

/**
 * Created by Matsuri on 2022/7/20 - 13:23
 */

public class Main {

    public static void main(String[] args) {
        OverLoadExer1 overLoadExer1 = new OverLoadExer1();
        overLoadExer1.mOL(2);
        overLoadExer1.mOL(2, 3);
        overLoadExer1.mOL("曾智牛逼!");

        OverLoadMax overLoadMax = new OverLoadMax();
        overLoadMax.max(2, 3);
        overLoadMax.max(2.0, 3.0);
        overLoadMax.max(2.0, 2.6, 2.2);
    }
}
