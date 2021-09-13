package com.biz.datastructure.programs;


import java.util.Scanner;

public class HashTableMain {
    public static void main(String[] args) {
        Operations operations=new Operations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to find frequency of word");
        switch (sc.nextInt()){
            case 1:
                operations.findFrequency();
        }
    }
}
