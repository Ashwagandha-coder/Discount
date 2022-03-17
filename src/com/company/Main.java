package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] price = new int[5];

    price[0] = 5;
    price[1] = 100;
    price[2] = 20;
    price[3] = 66;
    price[4] = 16;



    int discount;
    int offset;
    int readLenth;

    // Ввод скидки позиции длинны
    Scanner scanner = new Scanner(System.in);
    int[] values = new int[3];

    for (int j = 0; j <= 2; j++)
    {
        values[j] = scanner.nextInt();
    }
    //scanner.close();

    // Проверка offset
    if (values[1] > 0) {
        offset = values[1];
    }
    else {
        System.out.println("Введите положительный offset");
        Scanner scannerOffset = new Scanner(System.in);
        offset = scannerOffset.nextInt();
        scannerOffset.close();
    }
    // Проверка discount
        if ((values[0] >= 1) && (values[0] <= 99)) {
            discount = values[0];
        }
    else {
            System.out.println("Введите discount от 1 до 99");
            Scanner scannerDiscount = new Scanner(System.in);
            discount = scannerDiscount.nextInt();
            scannerDiscount.close();
        }
    // Проверка ReadLength
    if ((values[2] > 0) && (values[2] <= price.length)) {
            readLenth = values[2];
        }
    else {
            System.out.println("Введите readLength положительным и в пределах массива");
            Scanner scannerReadLength = new Scanner(System.in);
            if (scannerReadLength.hasNextInt())
                 readLenth = scannerReadLength.nextInt();
            else
                readLenth = 0;
            //scannerReadLength.close();
        }


    //discount = values[0];
    //offset = values[1];
    //readLenth = values[2];

        scanner.close();



    System.out.println(DescryptData(price,discount,offset,readLenth));
    }

    public static ArrayList<Integer> DescryptData(int[] price, int discount, int offset, int readLength) {
        ArrayList<Integer> newPrice = new ArrayList<Integer>();
        for (int i = offset; i <= readLength; i++) {
            newPrice.add(price[i] - ((price[i] * discount)/100));
        }
        return newPrice;

    }
}
