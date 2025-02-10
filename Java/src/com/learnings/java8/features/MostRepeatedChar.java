package com.learnings.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedChar 
{
    public static void main(String[] args) 
    {
        List<String> listOfStrings = Arrays.asList("abc", "def", "abc", "ghi", "pst", "def", "yes", "def");
         
        Map<String, Long> elementCountMap = listOfStrings.stream()
                                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
         
        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
         
        System.out.println("Count : "+mostFrequentElement.getValue());
    }
}