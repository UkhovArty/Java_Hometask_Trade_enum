package ru.sberbank;

public enum tradeType {

    BOND

    {
        @Override
        public Trade createTrade (Double price){
        return new BOND(price);
    }
    },
    COMMODITY_SPOT

    {
        @Override
        public Trade createTrade (Double price){
        return new COMMODITY_SPOT(price);

    }
    },
    FX_SPOT

    {
        @Override
        public Trade createTrade (Double price){
        return new FX_SPOT(price);
    }

    },
    IR_SWAP

    {
        @Override
        public Trade createTrade (Double price){
        return new IR_SWAP(price);
    }
    };
    public abstract Trade createTrade(Double price);

    }
