package ru.sberbank;

public class IR_SWAP extends Trade{
    public IR_SWAP(Double price) {
        super(price);
        System.out.println("IR_SWAP" + " " + price);
    }
}