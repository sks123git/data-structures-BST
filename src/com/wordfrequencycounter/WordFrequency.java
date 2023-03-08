package com.wordfrequencycounter;
//Program to count word frequency in a sentence
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.asList;

public class WordFrequency {
    public void wordFrequency(String text) {

        Map<String, Integer> freqMap = new HashMap<>();
        asList(text.split(" ")).forEach(s -> {
            if (freqMap.containsKey(s)) {
                Integer count = freqMap.get(s);
                freqMap.put(s, count + 1);
            } else {
                freqMap.put(s, 1);
            }
        });
        System.out.println(freqMap.toString());
    }
    public void specificWordFrequency(String text) {

        Map<String, Integer> freqMap = new HashMap<>();
        Pattern pattern = Pattern.compile("(?i)para");
        Matcher matcher = pattern.matcher(text);
        int count=0;
        while (matcher.find()){
            count++;
        }
        freqMap.put("para or Para", count);
        System.out.println(freqMap.toString());
    }

    public static void main(String[] args) {
        System.out.println("word frequency:");
        WordFrequency wordFrequency = new WordFrequency();
        String text = "To be or not to be";
        String text2 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        wordFrequency.wordFrequency(text);
        wordFrequency.specificWordFrequency(text2);
    }
}