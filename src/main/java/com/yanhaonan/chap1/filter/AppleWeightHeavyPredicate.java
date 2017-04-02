package com.yanhaonan.chap1.filter;

import com.yanhaonan.bean.Apple;

/**
 * Created by Vegeta on 4/2/17.
 */
public class AppleWeightHeavyPredicate implements ApplePredicator {
    public boolean predicate(Apple apple) {
        return apple.getWeight() > 150;
    }
}
