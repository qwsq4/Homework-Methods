import java.time.LocalDate;

public class Main {
    ///Метод для решения задания 1
    public static boolean definitionLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }

    ///Метод для решения задания 2
    public static byte checkNeededVersion(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (year < currentYear) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (year < currentYear) {
                return 3;
            } else {
                return 4;
            }
        }
    }

    ///Метод для решения задания 3
    public static byte deliveryTime(int distance) {
        byte deliveryTime = 0;
        if (distance <= 20) {
            deliveryTime = 1;
        }
        if (distance > 20 && distance <= 60) {
            deliveryTime = 2;
        }
        if (distance > 60 && distance <= 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }

    public static void main(String[] args) {
        ///Задание 1
        System.out.println("  Задание 1");
        int year = 2011;  ///Использую один и тот же год для 1 и 2 задания
        boolean yearIsLeap = definitionLeapYear(year);
        if (yearIsLeap) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

        ///Задание 2
        System.out.println("  Задание 2");
        int os = 1;
        byte neededVersion = checkNeededVersion(os, year);
        if (neededVersion == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (neededVersion == 2) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (neededVersion == 3) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (neededVersion == 4) {
            System.out.println("Установите приложение для Android по ссылке");
        }

        ///Задание 3
        System.out.println("  Задание 3");
        int deliveryDistance = 45;
        int deliveryTime = deliveryTime(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryTime);
    }
}