package com.yanhaonan.chap5.q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vegeta on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqList = numList.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(sqList);
    }
}
