public class Main {
    public static void main(String[] args) {
        //задание1

        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }



        //задание2

        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }

        }


        //задание3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным ");
        } else {
            System.out.println(year + " не является високосным");
        }

        //задание4

        int deliveryDistance = 95;
        int deliverDays = 1;
        if (deliveryDistance > 20) {
            deliverDays++;
        }
        if (deliveryDistance > 60); {
            deliverDays++;
            System.out.println("потребуется дней " + deliverDays);
        }


        //задание 5
        int monthNumber = 12;
        switch (monthNumber) {
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
            case 12:
                System.out.println("Зима");
                break;
            default:
            System.out.println("некорректный месяц " + monthNumber);

        }
    }
}