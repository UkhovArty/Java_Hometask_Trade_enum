package ru.sberbank;

import java.io.BufferedReader;
import java.io.IOException;

public class Analyzer {
    public static void analysis(BufferedReader stream) throws IOException {
        String[] str = new String[7];
        String typeOfTrade;
        String price;
        for (int i = 0; i < 7; i++) {
            str[i] = stream.readLine();
        }
        typeOfTrade = str[2];
        price = str[4];
        String tot = "nothing";
        tot = typeOfTrade.split("=")[1];
        price = price.split("=")[1];
        Double pr = Double.parseDouble(price);
        tot = tot.toUpperCase();
        tradeType chooseType = tradeType.valueOf(tot);
        chooseType.createTrade(pr);
        }
}

