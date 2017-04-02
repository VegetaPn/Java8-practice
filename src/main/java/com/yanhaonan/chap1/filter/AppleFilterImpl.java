package com.yanhaonan.chap1.filter;

import com.yanhaonan.bean.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vegeta on 4/2/17.
 */
public class AppleFilterImpl implements AppleFilter {
    public List<Apple> filterApples(List<Apple> appleList, ApplePredicator predicator) {
        List<Apple> filteredApples = new ArrayList<Apple>();
        for (Apple apple : appleList) {
            if (predicator.predicate(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }
}
