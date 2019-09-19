package ru.sberbank;

public class BOND extends Trade{
    public BOND(Double price) {
        super(price);
        System.out.println("BOND" + " " + price);
    }
}
