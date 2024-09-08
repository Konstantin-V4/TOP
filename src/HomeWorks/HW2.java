package HomeWorks;

public class HW2 {
    public static void main(String[] args) {

    // Начало

    int yes = 1;
    int no = 0;

    if (yes > no) {
        System.out.println("Поставили чайник");
    } else if (yes < no) {
        System.out.println("Не поставили чайник");
    }

        boolean stoveOn = true;
        boolean takeCup = true;
        boolean putCoffee = true;
        boolean putSugar = true;

        if (stoveOn) {
            System.out.println("Включили плитку");
        }
        if (takeCup) {
            System.out.println("Достали кружку");
        }
        if (putCoffee) {
            System.out.println("Положили кофе в кружку");
        }
        if (putSugar) {
            System.out.println("Положили сахар в кружку");
        }


    if (yes > no) {
        System.out.println("Чайник вскипел");
    } else if (yes < no) {
        System.out.println("Чайник не вскипел");
    }


        boolean poorWater = true;
        boolean stirCoffee = true;

        if (poorWater) {
            System.out.println("Налили воды в кружку");
        }
        if (stirCoffee) {
            System.out.println("Размешали кофе");
        }


    if (yes > no) {
        System.out.println("Кофе готово");
    } else if (yes < no) {
        System.out.println("Кофе не готово");
    }

    // Конец

    }
}
