package com.yanhaonan.chap10.c10.q4.p3;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by Vegeta on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");

        assert 5 == readDuration(props, "a");
        assert 0 == readDuration(props, "b");
        assert 0 == readDuration(props, "c");
        assert 0 == readDuration(props, "d");
    }

    public static int readDuration(Properties props, String name) {
        Optional<String> optProps = Optional.ofNullable(props.getProperty(name));
        return optProps.flatMap(Main::string2Int)
                .filter(i -> i > 0)
                .orElse(0);
    }

    private static Optional<Integer> string2Int(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
