package com.yanhaonan.chap5.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vegeta on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> firList = Arrays.asList(1, 2, 3);
        List<Integer> secList = Arrays.asList(3, 4);
        List<List<Integer>> pairs = new ArrayList<>();

        firList.forEach(a -> secList.stream()
                .filter(b -> (a + b) % 3 == 0)
                .forEach(b -> pairs.add(Arrays.asList(a, b))));
        System.out.println(pairs);

        List<int[]> ansPair = firList.stream()
                .flatMap(i -> secList.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        System.out.println("end");
    }
}
