package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        while(number>0){
            result = result + number%10;
            number /= 10;
        }
        System.out.println(result);
    }
}
