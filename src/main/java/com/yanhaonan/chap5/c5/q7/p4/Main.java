package com.yanhaonan.chap5.c5.q7.p4;

import java.util.stream.Stream;

/**
 * Created by Vegeta on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Stream.iterate(new int[] {0, 1}, (arr) -> new int[] {arr[1], arr[0] + arr[1]})
                .limit(20)
                .forEach(arr -> System.out.println("(" + arr[0] + "," + arr[1] + ")"));
    }
}
