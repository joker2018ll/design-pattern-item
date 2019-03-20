package com.gupao.vip.edu.pattern.factory.abstr;

import com.gupao.vip.edu.pattern.factory.*;

/**
 * #ClassName MilkFactory
 * #Description TODO
 * #Date 2019/3/19 23:48
 * #Version 1.0
 **/
public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getTeLunSu() {
        return new TeLunSu();
    }

    @Override
    public Milk getYiLi() {
        return new YiLi();
    }

    @Override
    public Milk getMengNiu() {
        return new MengNiu();
    }

    @Override
    public Milk getSanLu() {
        return new SanLu();
    }
}
