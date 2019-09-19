package ru.sberbank;

public class COMMODITY_SPOT extends Trade{
    public COMMODITY_SPOT(Double price) {
        super(price);
        System.out.println("COMMODITY_SPOT"+ " " + price);
    }
}