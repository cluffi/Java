package practice_1;

import java.util.Scanner;

public class Task_2 {
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

        if(yuan % 100 >= 11 && yuan % 100 <= 14)
            System.out.println("Вы ввели " + yuan + " китайских юаней");
        else if(yuan % 10 == 1)
            System.out.println("Вы ввели " + yuan + " китайский юань");
        else if(yuan % 10 > 1 && yuan % 10 < 5)
            System.out.println("Вы ввели " + yuan + " китайских юаня");
        else
            System.out.println("Вы ввели " + yuan + " китайских юаней");

        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("Количество рублей: " + Math.ceil(roubles));
    }
}