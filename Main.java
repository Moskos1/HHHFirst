import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(32.2);
        expenses.add(0,56.6); //трата в начало списка
        expenses.add(42.3);
        expenses.add(54.8);
        expenses.add(62.9);
        double myExpense = expenses.get(0);
        System.out.println(myExpense);
        System.out.println(expenses);
        System.out.println(expenses.size());
        for (Double exp: expenses) {
            System.out.println("Трата на сумму " + exp + " руб");
        }
        if (!expenses.isEmpty()){
            System.out.println(("Трат в списке " + expenses.size()));
        }
        boolean isExp = expenses.contains(290.32);
        if(!isExp) {
            expenses.add(290.32);
            System.out.println("Трата в 290.32 руб добавлена");
        }
        System.out.println(expenses);
        ArrayList<String> studentsNames = new ArrayList<>();

    }
}
