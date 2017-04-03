package com.yanhaonan.chap5.c5.q5.p2;

import com.yanhaonan.bean.Trader;
import com.yanhaonan.bean.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vegeta on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950)
        );

        /**
         * Implementations of (1)
         */
        List<Transaction> tranIn2011 = transactions.stream()
                .filter(tran -> tran.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(tranIn2011);

        /**
         * Implementations of (2)
         */
        List<String> cities = transactions.stream()
                .map(tran -> tran.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);

        /**
         * Implementations of (3)
         */
        List<Trader> tradersFromCamb = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(tradersFromCamb);

        /**
         * Implementations of (4)
         */
        List<String> tradersName = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(tradersName);

        /**
         * Implementations of (5)
         */
        boolean isInMilan = transactions.stream()
                .anyMatch(tran -> tran.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println("Is any trader from Milan: " + isInMilan);

        /**
         * Implementations of (6)
         */
        int sumValue = transactions.stream()
                .filter(tran -> tran.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .get();
        System.out.println("Sum value of transactions in Cambridge: " + sumValue);

        /**
         * Implementations of (7)
         */
        int maxValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .get();
        System.out.println("Max value of transactions is: " + maxValue);

        /**
         * Implementations of (8)
         */
        int minValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min)
                .get();
        System.out.println("Min value of transactions is: " + minValue);
    }
}
