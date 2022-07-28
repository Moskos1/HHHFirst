import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько вы хотите положить на счёт");
        long money = scan.nextLong();
        bank.setMoney(money);
        System.out.println("" + bank.getMoney() + "");
        GeographyTeacher teacher = new GeographyTeacher();
        System.out.println("Урок начинае с фразы: " + teacher.startLesson());
        GymTeacher teacher1 = new GymTeacher();
        System.out.println("Учитель физкультуры говорит: ");
        teacher1.startLesson();
    }
}
