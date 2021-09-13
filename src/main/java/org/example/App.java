package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int age;
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        System.out.println(age > 15 ? "You are old enough to legally drive." : "You are not old enough to legally drive");
    }
}