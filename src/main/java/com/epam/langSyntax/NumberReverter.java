package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int a3 = number/100;
        int a1 = number%10;
        int a2 = (number%100 - a1)/10;
        number = a1*100 + a2*10 + a3;
        System.out.println(number);
    }
}
