package com.biz.datastructure.programs;

public class Operations {

    public static  void findFrequency() {
        String sentence = "To be or not to be";
        HashTable hashTable = new HashTable();

        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = (Integer) hashTable.get(word);
            if (value == null) {
                value = 1;
            } else {
                value++;
            }
            hashTable.add(word, value);
        }
        Integer frequency = (Integer) hashTable.get("to");
        System.out.println(frequency);
    }
}
