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
    discount = values[0];
    offset = values[1];
    readLenth = values[2];



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
