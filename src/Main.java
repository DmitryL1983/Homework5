import java.util.Random;

public class Main {
    public static void main(String[] args) {
      // Задание 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case  1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ваша ОС не поддерживается. Используйте устройство Android или iOS");
        }
        // Задание 2
        int clientDeviceYear = 2014;
        int clientOS1 = 1;
        switch (clientOS1) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case  1:
                if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Ваша ОС не поддерживается. Используйте устройство Android или iOS");
        }
        // Задание 3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 95;
        int deliveryTime =1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (deliveryTime + 1) );
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней " + (deliveryTime + 2));
        }  else { System.out.println("Уточните время на горячей линии банка");
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}