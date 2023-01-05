package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        switch (month) {
            case (2):
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(29);
                    break;
                } else {
                    System.out.println(28);
                    break;
                }
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(31);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }
}
