package ru.netology;

public class Main {

    public static void main(String[] args) {
        SalesManager period = new SalesManager(new long[]{68, 55, 98, 35, 87, 100});

        System.out.println("Максимальное количество продаж за период: " + period.max() + " шт.");

        System.out.println("Среднее количество продаж за период: " + period.croppedAverage() + " шт.");

    }

}
