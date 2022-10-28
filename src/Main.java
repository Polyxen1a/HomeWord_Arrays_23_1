public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String year = isLeap(2022);
        System.out.println(year);
    }

    public static String isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return year + " — високосный год";
        } else {
            return year + " — не високосный год";
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    static {
        // Задание 2
        System.out.println("Задание 2");
        System.out.println(chooseOS(1, 2014));
    }

    public static String chooseOS(int OS, int year) {
        String result;
        if ((OS == 0) && (year < 2015)) {
            result = "Установите облегчённую версию приложения для iOS по ссылке";
        } else if ((OS == 1) && (year < 2015)) {
            result = "Установите облегченную версию приложения для Android по ссылке";
        } else {
            switch (OS) {
                case 0:
                    result = "Установите версию приложения для iOS по ссылке";
                case 1:
                    result = "Установите версию приложения для Android по ссылке";
                default:
                    result = "Под вашу операционную систему нет приложения";
            }
        }
        return result;
    }
        static {
            // Задание 3
            System.out.println("Задание 3");


            int deliveryDistance;
                int result = 1;
            if (deliveryDistance > 20) {
                    result++;
                }
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    result++;
                } else {
                    System.out.println("Невозможно рассчитать срок доставки");
                }
                System.out.println("Потребуется дней: " + result);
            }
    }

}


