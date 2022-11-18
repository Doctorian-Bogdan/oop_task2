import products.CheeseCheddar;
import products.Food;
import products.PastaMakfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int command;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Приветствуем вас в магазине '25 Пожалуйста'");
        printMenu();
        System.out.println(">>>");

        while (true) {
            command = scanner.nextInt();

            switch (command) {
                case 0 ->{
                    return;
                }
                case 1 -> {

                }
                default -> System.out.println("Нет такой команды, попробуйте еще раз");
            }
        }
    }

    public static void test() {
        List<Food> food = new ArrayList<>();

        food.add(new CheeseCheddar(
                1,
                "Cheese Cheddar",
                300,
                "12.12.2022",
                "cheddar")
        );

        food.add(new PastaMakfa(
                2,
                "Pasta Makfa",
                120,
                "03.01.2023",
                "sink")
        );

        System.out.println(Arrays.toString(food.toArray()));
    }

    public static void printMenu() {
        System.out.println("Выберите, чтобы вы хотели сделать?");
        System.out.println("1 - Посмотреть товары на складе");
        System.out.println("2 - Посмотреть товары на прилавках");
        System.out.println("3 - Купить товар");
        System.out.println("0 - Выйти");
    }
}
