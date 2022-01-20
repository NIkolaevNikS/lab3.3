package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = info.nextInt();
        if (a == 5)
        System.out.println("Отлично");
        else if (a == 4)
        System.out.println("Хорошо");
        else if (a == 3)
        System.out.println("Удовлетворительно");
        else if (a == 2)
        System.out.println("Неудовлетворительно");
        else
        System.out.println("Вне диапазона");
        }
    }
