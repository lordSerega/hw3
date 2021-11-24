package ru.skypro;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        byte i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {

        byte friday = 5;

        for (byte i = 1; i <= 31; i++) {
            if (friday == i) {
                System.out.println("Сегодня пятница, " + i + "-e число. Необходимо подготовить отчет.");
                friday += 7;
            }
        }


    }

    public static void task3() {

        int thisYear = 2021;
        int beforeYear = thisYear - 200;
        int endYear = thisYear + 100;

        while (beforeYear < endYear) {
            if (beforeYear % 79 == 0) {
                System.out.println(beforeYear);
            }
            beforeYear++;
        }


    }
}

