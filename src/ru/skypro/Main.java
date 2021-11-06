package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int currentYear = 2021;
        int clientOS = 1;
        int clientDeviceYear = 2020;
        int deliveryDistance = 80;
        int time = 1;
        String line = "abccddefgghiiijjk";
        System.out.println("Задание №1");
        chekYear(currentYear);
        System.out.println();
        System.out.println("Задание №2");
        chekPhone(currentYear,clientOS,clientDeviceYear);
        System.out.println();
        System.out.println("Задание №3");
        chekCard(deliveryDistance,time);
        System.out.println("На доставку необходимо " + time + " дней");
        System.out.println();
        System.out.println("Задание №4");
        chekLine(line);
        System.out.println();
        System.out.println("Задание №5");
        int arr1[] = {3, 2, 1, 6, 5};
        sort(arr1);



    }
    // Метод под задание №1
    public static void chekYear(int currentYear){
        if (currentYear % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (currentYear % 100 == 0) {
            System.out.println(" Год не является високосным");
        }
        else if (currentYear % 4 == 0 )
            System.out.println("Год является високосным");
        else
            System.out.println(" Год не является високосным");
    }
    // Метод под задание №2
    public static void chekPhone(int currentYear,int clientOS, int clientDeviceYear) {
        if (clientOS ==0)
        {
            if (clientDeviceYear <currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <currentYear)
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            else
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    // Задание №3
    public static int chekCard(int deliveryDistance,int time){
        /*int deliveryDistance = 95;
        int timeDelivery = ((deliveryDistance + 19) / 40) + 1;
        System.out.println("Потребуется дней: " + timeDelivery);
        */
        if (deliveryDistance <=20) {
            time = 1;
        }
        else if (deliveryDistance>20 && deliveryDistance<=60) {
            time += 1;
        }
        else if (deliveryDistance<=100) {
            time += 2;
        }
        return time;
    }
    // Задане №4
    public static void chekLine( String line){
        StringBuilder sb = new StringBuilder();
        char[]  st = line.toCharArray();
        sb.append(st[0]);
        for (int i = 1; i < st.length; i++) {
            if (st[i-1] != st[i])
                sb.append(st[i]);
        }
        System.out.println(sb);
    }
    // Задание №5
    public static void sort (int arr1[]){
        for (int i = 4; i > -1; i--) {
            System.out.print(arr1[i]);
        }
    }
}
