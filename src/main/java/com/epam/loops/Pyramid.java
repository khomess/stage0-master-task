package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 2; j < cathetusLength+1; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    if (i == cathetusLength) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
