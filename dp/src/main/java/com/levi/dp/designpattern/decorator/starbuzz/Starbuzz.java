/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.dp.designpattern.decorator.starbuzz;

import com.levi.dp.designpattern.decorator.starbuzz.concretComponent.Espresso;
import com.levi.dp.designpattern.decorator.starbuzz.concretdecorator.impl.Mocha;
import com.levi.dp.designpattern.decorator.starbuzz.concretdecorator.impl.Soy;

/**
 *
 * @author zhangliwei
 * @version com.levi.dp.designpattern.decorator.starbuzz: Starbuzz.java, v 0.1 2018-11-16 12:40 AM zhangliwei Exp $ 
 */
public class Starbuzz {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+"&& $"+beverage.cost());
    }
}
