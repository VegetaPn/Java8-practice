package com.yanhaonan.chap1.filter;

import com.yanhaonan.bean.Apple;

import java.util.List;

/**
 * Created by Vegeta on 4/2/17.
 */
public interface AppleFilter {
    List<Apple> filterApples(List<Apple> appleList, ApplePredicator predicator);
}
