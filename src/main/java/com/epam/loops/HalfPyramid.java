package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++){
            for (int j = 1 + i; j <= cathetusLength; j++){
                System.out.print(" ");
            }
            for (int k = cathetusLength-i+1; k <= cathetusLength; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
