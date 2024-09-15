package HomeWorks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        //Первое задание

        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько вам лет? ");
        int age = sc.nextInt();
        int age1 = 2;
        int age2 = 6;
        int age3 = 18;
        int age4 = 24;
        if (age < age1) {
            System.out.println("Вам нужно спать в кроватке");
        } else if (age <= age2) {
            System.out.println("Если ваш возраст " + age + " то вам нужно ходить в детский сад");
        } else if (age <= age3) {
            System.out.println("Если ваш возраст " + age + " то вам нужно посещать школу");
        } else if (age < age4) {
            System.out.println("Если ваш возраст " + age + " то вам нужно учиться в университетe");
        } else if (age >= age4) {
            System.out.println("Если ваш возраст " + age + " то вам пора идти на работу");
        }

        //Второе задание

        int salaryDiana = 66_660;
        int salaryAndrey = 77_770;
        int salaryMaria = 88_880;

        int percent = 15;

        int newSalaryDiana = salaryDiana + (salaryDiana * percent) / 100;
        int newSalaryAndrey = salaryAndrey + (salaryAndrey * percent) / 100;
        int newSalaryMaria = salaryMaria + (salaryMaria * percent) / 100;

        int annualIncomeDiana = salaryDiana * 12;
        int annualIncomeAndrey = salaryAndrey * 12;
        int annualIncomeMaria = salaryMaria * 12;

        int newAnnualIncomeDiana = newSalaryDiana * 12 - annualIncomeDiana;
        int newAnnualIncomeAndrey = newSalaryAndrey * 12 - annualIncomeAndrey;
        int newAnnualIncomeMaria = newSalaryMaria * 12 - annualIncomeMaria;

        System.out.println("Диана теперь получает " + newSalaryDiana + " рублей. Годовой доход вырос на " + newAnnualIncomeDiana + " рублей");
        System.out.println("Андрей теперь получает " + newSalaryAndrey + "  рублей. Годовой доход вырос на " + newAnnualIncomeAndrey + " рублей");
        System.out.println("Мария теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + newAnnualIncomeMaria + " рублей");


        //Третье задание

        System.out.print("Введите номер месяца: ");
        int monthNumber = sc.nextInt();

        String message = switch (monthNumber) {

            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Некорректный ввод";

        };
        System.out.print(message);
    }
}
