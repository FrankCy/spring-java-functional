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

    /**
     * 不包含参数，使用空括号（）表示没有参数。
     * 该Lambda表达式实现Runnable接口，该接口也只有一个run方法，无参，且返回类型为void。
     */
    private static Runnable noArguments = () -> System.out.println("noArguments ———— Hello World");

    /**
     * Lambda表达式包含且只包含一个参数，可省略参数的括号;
     * ActionListener：Java中关于事件处理的一个接口，继承自EventListener
     */
    private static ActionListener oneArgument = event -> System.out.println("button clicked");

    /**
     * 主题可以是一段代码段，通过大括号"({})"包括代码。
     * 可以用返回和抛出异常来退出代码块。
     */
    private static Runnable multiStatement = () -> {
        System.out.print("multiStatement Hello ");
        System.out.println("multiStatement World");
    };

    /**
     * Lambda表达式可以包含多个参数；
     * 下面参数并不是将2个数相加，而是创建了一个函数，用来计算两个数相加的结果；
     * 变量add类型是BinaryOperator<Long>，它不是两个数的合，而是将两个数字相加的那行代码；
     */
    private static BinaryOperator<Long> add = (x, y) -> x + y;

    /**
     * 先声明参数类型的Lambda表达式，上述例子都没有声明
     */
    private static BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

    public static void main(String[] args) {
        noArguments.run();
        multiStatement.run();
        System.out.println("add : " + add.apply(1L,2L));
        System.out.println("addExplicit : " + addExplicit.apply(5L, 6L));
    }

}
