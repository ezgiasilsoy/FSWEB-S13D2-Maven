package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num){
        num = Math.abs(num);
        String newNum = Integer.toString(num);
        String reversed = new StringBuilder(newNum).reverse().toString();
        if(newNum.equals(reversed)){
            return true;
        } else return false;
    }
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
    public static String numberToWords(int num) {
        if (num < 0) return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        String result = "";

        if (num == 0) return "Zero";

        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result += words[digit] + " ";
        }

        return result.trim(); // sondaki boşluğu kaldır
    }
}
