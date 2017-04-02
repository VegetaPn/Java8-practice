package com.yanhaonan.chap1.filter;

import com.yanhaonan.bean.Apple;

/**
 * Created by Vegeta on 4/2/17.
 */
public interface ApplePredicator {
    boolean predicate(Apple apple);
}
