package ru.sberbank;

public class FX_SPOT extends Trade{
    public FX_SPOT(Double price) {
        super(price);
        System.out.println("FX_SPOT" + " " + price);
    }
}