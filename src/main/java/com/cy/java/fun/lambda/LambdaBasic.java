package com.cy.java.fun.lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @version 1.0
 * @description：Lambda基础语法练习
 * @author: Yang.Chang
 * @project: spring-java-functional
 * @package: com.cy.java.fun.lambda、
 * @email: cy880708@163.com
 * @date: 2019/3/15 下午6:29
 * @mofified By:
 */
public class LambdaBasic {

    public static void lambdaAfter() {

        Runnable noArguments = () -> System.out.println("Hello World");

        ActionListener oneArgument = event -> System.out.println("button clicked");

        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };

        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
        
    }

    public static void main(String[] args) {

    }

}
