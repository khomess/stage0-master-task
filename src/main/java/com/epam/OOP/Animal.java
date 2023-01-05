package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String fur;
        String paws;
        if (hasFur == true){
            fur = "a";
        } else {
            fur = "no";
        }
        if (numberOfPaws > 1){
            paws = "paws";
        } else {
            paws = "paw";
        }
        return "This animal is mostly "+color+". It has "+numberOfPaws+" "+paws+" and "+fur+" fur.";
    }
}
