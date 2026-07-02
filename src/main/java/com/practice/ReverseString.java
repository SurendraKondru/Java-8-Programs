package com.practice;

public class ReverseString {

    public static void main(String[] args) {
        String str = "microservices";
        final String string = new StringBuilder(str).reverse().toString();
        System.out.println(string);

        final char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

}
