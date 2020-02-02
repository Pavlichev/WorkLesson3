package lesson3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    
    static Random random = new Random();
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Сделайте выбор:\n"+
                    "1. Отгадай число\n2. Выход\n: ");
            switch (sc.next()) {
                case "1":
                    Number();
                    break;

                default:
                    return;
            }
        }
    }


    public static void Number() {
        do {
            int count = 0;
            int guess = -1;
            int number;
            number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print(
                        "Попытка [" + (count + 1) + "] Введите число (0..9): ");
                try {
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("Вы выйграли!");
                    } else {
                        System.out.println("Ваше число: " + ((guess > number)?
                                "Больше." : "Меньше."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Просьба вводить цельные числа!");
                    sc.next();
                }
            }
            if (count == 3)
                System.out.println("Вы проиграли!");
            System.out.print("Повторим?\n[1 - yes / 0 - no]: ");
        } while (sc.next().equals("1"));
    }
}
