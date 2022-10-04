package Excepsion;

import java.util.Scanner;

public class CheckedVsUncheckedExceptions {
    public static void main(final String[] args) {
        runTest();
    }

    private static void runTest() {
        runUncheckedExceptionExample();
        try {
            runCheckedExceptionExample();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runUncheckedExceptionExample() {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new IllegalArgumentException("Number must be positive!");
        }
    }

    private static void runCheckedExceptionExample() throws Exception {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new Exception("Number must be positive!");
        }
    }
}
