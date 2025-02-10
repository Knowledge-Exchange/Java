package com.learnings.java8.features;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar 
{
    public static void main(String[] args) 
    {
        String inputString = "Hellow world ! Welcome to java".replaceAll("\\s+", "").toLowerCase();
         
        Map<String, Long> charCountMap = 
                            Arrays.stream(inputString.split(""))
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
         
        String firstRepeatedChar = charCountMap.entrySet()
                                                .stream()
                                                .filter(entry -> entry.getValue() > 1)
                                                .map(entry -> entry.getKey())
                                                .findFirst()
                                                .get();
         
        System.out.println(firstRepeatedChar);
    }
}