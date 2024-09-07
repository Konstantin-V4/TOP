import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Домашняя работа (Урок 5-6)

        // Объявление и инициализация переменных

        byte countRunCycle = 1;
        short numberOfUsers = 4324;
        int numberOfDownloads = 95439;
        long numberOfInstallation = 84324;
        float numberPi = 3.14f;
        double bodyTemperature = 36.6;
        boolean nowDaytime = true;
        char firstLetterAlphabet = 'a';

        // Арифметические операции

        int a = 50;
        int b = 25;

        int cars = a + b;
        int buyers = a - b;
        int target = a * b;
        int result = a / b;
        int deduction = a % b;

        System.out.println("Сложение: " + cars);
        System.out.println("Вычитание: " + buyers);
        System.out.println("Умножение: " + target);
        System.out.println("Деление: " + result);
        System.out.println("Остаток от деления: " + deduction);*/


        // Домашняя работа (Урок 7-8)

        // Сканнер

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сложение: ");
        int cars = sc.nextInt();
        System.out.print("Введите вычитание: ");
        int buyers = sc.nextInt();
        System.out.print("Введите умножение: ");
        int target = sc.nextInt();
        System.out.print("Введите деление: ");
        int result = sc.nextInt();
        System.out.print("Введите остаток от процента: ");
        int deduction = sc.nextInt();


        int a = 50;
        int b = 25;

        //int cars = a + b;
        //int buyers = a - b;
        //int target = a * b;
        //int result = a / b;
        //int deduction = a % b;

        System.out.println("Сложение: " + cars);
        System.out.println("Вычитание: " + buyers);
        System.out.println("Умножение: " + target);
        System.out.println("Деление: " + result);
        System.out.println("Остаток от деления: " + deduction);

        // Использование класса Random

        Random winner = new Random();
        int int1 = winner.nextInt(0,100);
        int int2 = winner.nextInt(0,100);
        int int3 = winner.nextInt(0,100);
        int int4 = winner.nextInt(0,100);

        char char1 = (char) int1;
        char char2 = (char) int2;
        char char3 = (char) int3;
        char char4 = (char) int4;

        System.out.println("Пароль: " + char1 + char2 + char3 + char4);

        // Переполнение типа int

        long myLong = 3_000_000_000L;
        int myInt = (int) myLong;
        System.out.println("My Int: " + myInt);

    }
}