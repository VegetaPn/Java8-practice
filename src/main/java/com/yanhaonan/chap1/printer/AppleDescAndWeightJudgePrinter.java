package com.yanhaonan.chap1.printer;

import com.yanhaonan.bean.Apple;
import com.yanhaonan.chap1.filter.AppleFilter;
import com.yanhaonan.chap1.filter.AppleFilterImpl;
import com.yanhaonan.chap1.filter.ApplePredicator;
import com.yanhaonan.chap1.filter.AppleWeightHeavyPredicate;

import java.util.List;

/**
 * Created by Vegeta on 4/2/17.
 */
public class AppleDescAndWeightJudgePrinter implements ApplePrinter {
    public String printApple(List<Apple> appleList) {
        StringBuffer sb = new StringBuffer();
        ApplePredicator applePredicator = new AppleWeightHeavyPredicate();
        for (Apple apple : appleList) {
            sb.append(apple.toString());
            sb.append("\n");
            if (applePredicator.predicate(apple)) {
                sb.append("isHeavy: True \n\n");
            } else {
                sb.append("isHeavy: False \n\n");
            }
        }
        return sb.toString();
    }
}
