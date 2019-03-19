package com.gupao.vip.edu.pattern.prototype;


/**
 * Created by ll on 2019/3/13.
 */
public class PrototypeTest {

    /*
     * ************
     * **原型理解***
     * ************
     *
     * 定义：原型实例指定创建对象的种类，并通过拷贝这些原型实例创建新的对象。属于创建型
     * 模式，调用者不需要知道任何创建细节，不用调用构造函数。
     *
     * 使用场景：
     * 1.手工调用大量set属性场景， new过程繁琐复杂
     * 2.类初始化消耗资源较多
     * 3.构造函数比较复杂
     * 4.循环体中产生大量对象。
     *
     * 原型模式的实现常用工具和机制：
     * BeanUtil、JSON、反射机制。
     *
     * 特性：
     * 原型模式中，可分为浅克隆和深克隆。
     * 浅克隆中原型实例中的引用对象不会复制，相反为深克隆。
     * Cloneable接口默认是浅克隆，深克隆需要重写clone接口实现。
     *
     * 原型模式和单例模式结合要注意，深克隆是会破坏单例的。
     */

    public static void main(String[] args) throws Exception {

        System.out.println("================浅克隆==================");
        shallow();
        System.out.println("================深克隆==================");
        deepClone();

    }

    private static void shallow() {
        Email email = new Email("今晚20:30上VIP课");
        User user = new User("mic");
        user.setEmail(email);
        User user1 = (User) user.clone();
        user1.setName("jack");
        user1.getEmail().setContent("今晚20:30上VIP课，请提前备课");

        System.out.println( user.getName() + "-> 上课内容：" + user.getEmail().getContent());
        System.out.println( user1.getName() + "-> 上课内容：" + user1.getEmail().getContent());
    }

    private static void deepClone() throws Exception{
        Email email = new Email("今晚20:30上VIP课");
        User user = new User("mic");
        user.setEmail(email);
        User user1 = (User) user.deepClone();
        user1.setName("jack");
        user1.getEmail().setContent("今晚20:30上VIP课，请提前备课");
        System.out.println( user.getName() + "-> 上课内容：" + user.getEmail().getContent());
        System.out.println( user1.getName() + "-> 上课内容：" + user1.getEmail().getContent());
    }

}
