/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.dp.designpattern.decorator.starbuzz.concretComponent;

import com.levi.dp.designpattern.decorator.starbuzz.Beverage;

/**
 *
 * 意式浓缩咖啡实现类
 *
 * @author zhangliwei
 * @version com.levi.dp.designpattern.decorator.starbuzz.concretComponent: Espresso.java, v 0.1 2018-11-16 12:32 AM zhangliwei Exp $ 
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.12;
    }
}
