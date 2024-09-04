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

        int a = 50;
        int b = 25;

        int cars = a + b;
        int buyers = a - b;
        int target = a * b;
        int result = a / b;
        int deduction = a % b;

        System.out.print("Сложение: ");
        cars = sc.nextInt();
        System.out.print("Вычитание: ");
        buyers = sc.nextInt();
        System.out.print("Умножение: ");
        target = sc.nextInt();
        System.out.print("Деление: ");
        result = sc.nextInt();
        System.out.print("Остаток от деления: ");
        deduction = sc.nextInt();

        // Использование класса Random

        Random winner = new Random();

        char char1 = 'A';
        System.out.print(char1);
        int firstGroupOfParticipants = char1;
        firstGroupOfParticipants = winner.nextInt(0, 100);
        System.out.println(firstGroupOfParticipants);

        char char2 = 'B';
        System.out.print(char2);
        int secondGroupOfParticipants = char2;
        secondGroupOfParticipants = winner.nextInt(101,200);
        System.out.println(secondGroupOfParticipants);

        char char3 = 'C';
        System.out.print(char3);
        int thirdGroupOfParticipants = char3;
        thirdGroupOfParticipants = winner.nextInt(201,300);
        System.out.println(thirdGroupOfParticipants);

        char char4 = 'D';
        System.out.print(char4);
        int fourthGroupOfParticipants = char3;
        fourthGroupOfParticipants = winner.nextInt(301,400);
        System.out.println(fourthGroupOfParticipants);

        // Переполнение типа int

        long myLong = 3_000_000_000L;
        int myInt = (int) myLong;
        System.out.println("My Int: " + myInt);

    }
}