package Excepsion;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        //1) неявная исключительная ситуация
        // System.out.println(2/0);
        //new Scanner(System.in).nextInt();
        //2 специально вызываемая
        throw new IllegalArgumentException("qwerty");
    }
}
