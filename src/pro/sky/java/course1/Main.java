package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //Задание 1.
        System.out.println("Задание 1.");
        int ios = 0;

        if (ios == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2.
        System.out.println("Задание 2.");
        int typeOfAdvice = 1;
        int clientDeviceYear = 2010;
        boolean deviceYear = clientDeviceYear >= 2015;

        if (deviceYear) {
            if (typeOfAdvice == 0) {System.out.println("Установите версию приложения для iOS по ссылке");}
            else System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (typeOfAdvice == 0) {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задание 3.
        System.out.println("Задание 3.");
        int year = 7504;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {System.out.println(year + " год является високосным");}
        else
            System.out.println(year + " год не является високосным");

        //Задание 4.
        System.out.println("Задание 4.");
        int deliveryDistance = 21;
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryTime + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется " + deliveryTime + " дня");
        } else {
            deliveryTime = 3;
            System.out.println("Потребуется " + deliveryTime + " дня");
        }

        //Задание 5.
        System.out.println("Задание 5.");
        int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
                }
        }
    }

