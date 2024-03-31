import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void installApp(int mobileYear, int oS) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0 && mobileYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (oS == 0 && mobileYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (oS == 1 && mobileYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (oS == 1 && mobileYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого приложения у нас нет");
        }
    }

    public static int countDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        }
        else if (distance > 20 && distance <= 60) {
            return 2;
        }
        else if (distance > 60 && distance <= 100) {
            return 3;
        }
        return -1;

    }

    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        checkLeapYear(3568);
        checkLeapYear(1574);
        checkLeapYear(2000);
        checkLeapYear(20100);
        //task 2
        System.out.println("task 2");
        installApp(2016, 0);
        installApp(3210, 2);
        installApp(2013, 1);
        //task 3
        System.out.println("task 3");

        int days = countDeliveryDays(101);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Количество дней доставки " + days);
        }


    }
}