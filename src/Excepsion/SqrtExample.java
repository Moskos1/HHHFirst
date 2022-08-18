package Excepsion;
/*
Программа запрашивает положительное число с консоли и выводит на экран
значение корня квадратного от этого числа и завершает своё выполнение
 */

import java.util.Scanner;

public class SqrtExample {
    public static void main(String[] args) {
        final double number = new Scanner(System.in).nextDouble();
        if (number >= 0) {
            System.out.println(Math.sqrt(number));

        } else

            throw new IllegalArgumentException("Number must be positive");

    }
}
