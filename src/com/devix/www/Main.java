package com.devix.www;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> func = x -> x * 2;
        int result = func.apply(10);
        System.out.println(result);
    }
}
