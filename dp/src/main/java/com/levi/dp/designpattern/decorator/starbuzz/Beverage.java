/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.dp.designpattern.decorator.starbuzz;

/**
 * 抽象的饮料类
 *
 * 也是装饰者模式中的抽象组件
 *
 * @author zhangliwei
 * @version com.levi.dp.designpattern.decorator.starbuzz: Beverage.java, v 0.1 2018-11-16 12:24 AM zhangliwei Exp $ 
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
         return description;
    }

    public abstract double cost();
}
