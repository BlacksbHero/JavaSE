package com.matsuri.oop;

/**
 * Created by Matsuri on 2022/6/17 -- 10:24
 *
 * 类中方法的声明和使用
 *  方法: 描述类应该具有的功能
 *    Such as: Math.sqrt()\ Math.random()\...
 *               Scanner.nextInt()\...
 *               Arrays.sort()\Arrays.toString()\...
 *
 *  1. Example:
 *    public void eat(){}
 *    public void sleep(int hour){}
 *    public String getName(){}
 *    public String getNation(String nation){}
 *
 *  2. 方法的声明:
 *    权限修饰符 返回值类型 方法名(形参列表){
 *      方法体
 *    }
 *
 *  3. 说明:
 *    3.1 关于权限修饰符:
 *      Java规定的4种权限修饰符: private\ public\ default\ protected
 *
 *    3.2 返回值类型: 有返回值 VS 没有返回值
 *      3.2.1 ① 如果方法有返回值, 则必须在方法声明时, 指定返回值类型.
 *               同时, 方法中需要使用return关键字来返回指定类型或常量.
 *            ② 如果方法没有返回值, 则声明方法时, 使用void来表示.
 *               通常没有返回值的方法中, 就不用使用return. 但是,
 *               如果使用的话, 只能 "return;" 来表示结束此方法.
 *
 *      3.2.2 我们定义方法时是否需要返回值?
 *        ① 具体问题具体分析.
 *
 *    3.3 方法名: 属于标识符, 遵循标识符的规则和规范, "见名知意" .
 *
 *    3.4 形参列表: 方法可以声明0个或多个形参.
 *      3.2.1 格式: 数据类型1 形参1, 数据类型2 形参2, ...
 *      3.2.2 该不该定义形参?
 *        具体问题具体分析.
 *
 *    3.5 方法体: 方法功能的体现.
 *
 *  4. return 关键字的使用:
 *    4.1 使用范围: 使用在方法体中.
 *    4.2 作用: ① 结束方法.
 *             ② 针对有返回值的方法, 使用 "return xxx;".
 *    4.3 注意: return 关键字后面不可以声明执行语句.
 *
 *  5. 方法的使用中, 可以调用当前类的属性或方法
 *    特殊的: 方法A中又调用了方法A: 递归方法.
 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.eat();
    }
}

class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭.");
    }

    public void sleep(int hour){
        System.out.println("休息了: " + hour + "个小时.");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是: " + nation + ".";
        return info;
    }

}