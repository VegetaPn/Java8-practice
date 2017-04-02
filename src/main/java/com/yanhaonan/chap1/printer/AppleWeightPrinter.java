package com.yanhaonan.chap1.printer;

import com.yanhaonan.bean.Apple;

import java.util.List;

/**
 * Created by Vegeta on 4/2/17.
 */
public class AppleWeightPrinter implements ApplePrinter {
    public String printApple(List<Apple> appleList) {
        StringBuffer sb = new StringBuffer();
        for (Apple apple : appleList) {
            sb.append(apple.getWeight());
            sb.append("\n");
        }
        return sb.toString();
    }
}
