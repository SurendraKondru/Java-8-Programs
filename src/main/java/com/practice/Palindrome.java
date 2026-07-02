package com.practice;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        final String reverseString = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseString)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
