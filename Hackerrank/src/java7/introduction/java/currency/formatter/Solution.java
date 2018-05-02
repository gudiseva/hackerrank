package java7.introduction.java.currency.formatter;

import java.util.*;
import java.text.*;

/*
 * Sample Input: 12324.134
 * 
 * Expected Output:
 * 	US: $12,324.13
 * 	India: Rs.12,324.13
 * 	China: ￥12,324.13
 * 	France: 12 324,13 €
 * 
 */
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        /* Create custom Locale for India - use the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");
        
        /* Create NumberFormats using Locales */
        NumberFormat usFormat     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

