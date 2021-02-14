package com.rap.answers;

import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mau kata apa?");
        String str = scanner.nextLine();
        scanner.close();
        isPalindrome(str);
        if (isPalindrome(str))
        {
            System.out.println("Bener Palindrome");
        }else{
            System.out.println("Bukan Palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        //using string builder since string is immutable, for performace reason by rap
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}


