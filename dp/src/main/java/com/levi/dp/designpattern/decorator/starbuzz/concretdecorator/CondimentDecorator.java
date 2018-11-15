/**
 * abssqr.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.levi.dp.designpattern.decorator.starbuzz.concretdecorator;

import com.levi.dp.designpattern.decorator.starbuzz.Beverage;

/**
 *
 * @author zhangliwei
 * @version com.levi.dp.designpattern.decorator.starbuzz.concretdecorator: CondimentDecorator.java, v 0.1 2018-11-16 12:29 AM zhangliwei Exp $ 
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    /**
     * 重写获取注释方法
     */
    public abstract String getDescription();
}
