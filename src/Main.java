public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");
        int deposit = 15000;
        int total = 0;
        int monthQuantity = 0;
        while (total < 2_459_000) {
            total += deposit;
            monthQuantity += 1;
        }
        System.out.println("Месяц " + monthQuantity + ", сумма накоплений равна " + total + " рублей");

        // task 2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = i - 1; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int birthRate = 17; // 204000
        int mortalityRate = 8; // 96000
        int yearQuantity = 1;
        while (yearQuantity <= 10) {
            population = population + (population / 1000 * 17) - (population / 1000 * 8);
            System.out.println("Год " + yearQuantity + ", численность населения составляет " + population);
            yearQuantity++;
        }

        // task 4
        System.out.println("task 4");
        deposit = 15000;
        int interestRate = 7;
        int interestPerMonth = 0;
        monthQuantity = 1;
        // вклад оценивается в целых рублях
        while (deposit < 12_000_000) {
            interestPerMonth = deposit * interestRate / 100;
            deposit += interestPerMonth;
            System.out.println("В конце месяца " + monthQuantity + ", сумма вклада уже " + deposit);
            monthQuantity++;
        }

        // task 5
        System.out.println("task 5");
        deposit = 15000;
        interestPerMonth = 0;
        monthQuantity = 1;
        // вклад оценивается в целых рублях
        while (deposit < 12_000_000) {
            interestPerMonth = deposit * interestRate / 100;
            deposit += interestPerMonth;
            if (monthQuantity % 6 == 0) {
                System.out.println("В конце месяца " + monthQuantity + ", сумма вклада уже " + deposit);
            }
            monthQuantity++;
        }

        // task 6
        System.out.println("task 6");
        deposit = 15000;
        interestPerMonth = 0;
        yearQuantity = 9;
        monthQuantity = 1;
        // вклад оценивается в целых рублях
        do {
            interestPerMonth = deposit * interestRate / 100;
            deposit += interestPerMonth;
            if (monthQuantity % 6 == 0) {
                System.out.println("В конце месяца " + monthQuantity + ", сумма вклада уже " + deposit);
            }
            if (monthQuantity % 12 == 0) {
                yearQuantity--;
            }
            monthQuantity++;
        } while (yearQuantity != 0);

        // task 7
        System.out.println("task 7");
        // не очень поняла задание, но надеюсь, что правильно
        /**
         * // примем, что месяц начинается с понедельника
         *         for (int fridayDay = 5; fridayDay <= 31; fridayDay = fridayDay + 7) {
         *             System.out.println("today is a Friday " + fridayDay);
         *         }
         *         // а теперь, что месяц начинается с пятницы
         *         for (int fridayDay = 1; fridayDay <= 31; fridayDay = fridayDay + 7) {
         *             System.out.println("today is a Friday " + fridayDay);
         *         }
         */

        for (int firstFriday = 1; firstFriday <= 7; firstFriday++) {
            for (int fridayDay = firstFriday; fridayDay <= 31; fridayDay = fridayDay + 7) {
                System.out.println("Сегодня пятница, " + fridayDay + "-е число. Необходимо подготовить отчет");
            }
        }

        // task 8
        System.out.println("task 8");
        System.out.println("8.1");
        int currentYear = 2024;
        int yearsAgo = 200;
        int yearsAhead = 100;
        int step = 79;
        // на мой взгляд самое оптимальное решение
        for (int year = currentYear - yearsAgo; year <= currentYear + yearsAhead; year++) {
            //System.out.println("итерация");
            if (year % step == 0) {
                System.out.println(year);
                year += (step - 1);
                // так будет гораздо меньше итераций, а "-1", так как сам for еще прибавит 1, чтобы не перескочить лишнее
            }
        }
        //
        System.out.println("8.2");
        int year = currentYear - yearsAgo;
        while (year <= currentYear + yearsAhead) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }
        // или так
        // просто для практики continue и отрицания
        System.out.println("8.3");
        for (year = currentYear - yearsAgo; year <= currentYear + yearsAhead; year++) {
            if (year % 79 != 0) {
                continue;
            }
            System.out.println(year);
        }

    }
}
