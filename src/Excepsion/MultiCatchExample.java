package Excepsion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            doSomething();

        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException" + e.getMessage());}
            catch (IllegalArgumentException e) {
                System.err.println("IllegalArgumentException" + e.getMessage());}


        System.out.println("After do something");

    }


    /**
    * @throws ClassNotFoundException
     * @throws IllegalArgumentException
     * @throws ArithmeticException
     *
     */
    private static void doSomething() throws ClassNotFoundException {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
        throw new IllegalArgumentException("value < 0");
        }
        if (value == 0) {
        throw new ArithmeticException("value = 0");
        }
        if (value == 5) { // проверяемое исключение
        throw new ClassNotFoundException("value = 5");
        }
        System.out.println("OK");
        }
        }

