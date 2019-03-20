package com.gupao.vip.edu.pattern.factory.abstr;

import com.gupao.vip.edu.pattern.factory.Milk;

/**
 * #ClassName AbstractFactory
 * #Description TODO
 * #Date 2019/3/19 23:46
 * #Version 1.0
 **/
public abstract class AbstractFactory {
    public abstract Milk getTeLunSu();
    public abstract Milk getYiLi();
    public abstract Milk getMengNiu();
    public abstract Milk getSanLu();

}
