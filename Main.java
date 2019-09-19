package ru.sberbank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input file name. If you want to input Data through the console, please type 0");
        InputStreamReader var = new InputStreamReader(System.in);
        BufferedReader varOne = new BufferedReader(var);
        String fileName = varOne.readLine();
        Input.typeOfInput(fileName);
    }
}
