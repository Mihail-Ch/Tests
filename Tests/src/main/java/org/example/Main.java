package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        boolean status = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (status) {
            System.out.print("Введите float число: ");
            try {
                float num = Float.parseFloat(reader.readLine());
                System.out.printf("Введите число равное %f\n", num);
                status = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }
        }
    }
}

