package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer>  number = Arrays.asList(23,3,23,67,66,5,22,66);
        List<Integer> evenNumber = number.stream().distinct().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);

    }
}
