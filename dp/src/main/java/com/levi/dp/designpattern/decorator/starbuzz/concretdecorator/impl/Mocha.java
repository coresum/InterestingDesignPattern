/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.dp.designpattern.decorator.starbuzz.concretdecorator.impl;

import com.levi.dp.designpattern.decorator.starbuzz.Beverage;
import com.levi.dp.designpattern.decorator.starbuzz.concretdecorator.CondimentDecorator;

/**
 *
 * @author zhangliwei
 * @version com.levi.dp.designpattern.decorator.starbuzz.concretdecorator.impl: Mocha.java, v 0.1 2018-11-16 12:36 AM zhangliwei Exp $ 
 */
public class Mocha extends CondimentDecorator {

    /**
     * 具体的装饰类持有抽象组件类的引用,
     * 所以才可以将每一层包装完成之后都装饰成一个组件对象
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 1.20+beverage.cost();
    }
}
