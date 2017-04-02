package com.yanhaonan.chap1;

import com.yanhaonan.bean.Apple;
import com.yanhaonan.chap1.printer.AppleDescAndWeightJudgePrinter;
import com.yanhaonan.chap1.printer.ApplePrinter;
import com.yanhaonan.chap1.printer.AppleWeightPrinter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Vegeta on 4/2/17.
 */
public class Main {
    public static void prettyPrintApples(List<Apple> inventory, ApplePrinter applePrinter) {
        String output = applePrinter.printApple(inventory);
        System.out.println(output);
    }

    public static void main(String[] args) {
        Apple apple = new Apple(100, "red");
        Apple apple2 = new Apple(160, "green");
        Apple apple3 = new Apple(120, "red");
        Apple apple4 = new Apple(130, "green");
        Apple apple5 = new Apple(180, "green");
        Apple apple6 = new Apple(150, "blue");

        List<Apple> apples = Arrays.asList(apple, apple2, apple3, apple4, apple5, apple6);
        prettyPrintApples(apples, new AppleWeightPrinter());
        prettyPrintApples(apples, new AppleDescAndWeightJudgePrinter());
    }
}
