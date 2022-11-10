

public class Main {
    public static void main(String[] args) {

        //задание 1

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        //задание 2

        int salary1 = 29000;
        int total2 = 0;
        for (int i = 0; i < 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total2 + " рублей");
        }

    }
}