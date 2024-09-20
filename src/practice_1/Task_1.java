package practice_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        double roubles;
        int yuan;
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество юаней: ");
        yuan = input.nextInt();

        if(yuan < 0)
        {
            System.out.print("Введено некорректное значение.");
            System.exit(1);
        }

        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("Количество рублей: " + Math.ceil(roubles));
    }
}