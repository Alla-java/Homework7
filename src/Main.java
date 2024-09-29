public class Main {
    public static void main(String[] args) {

        /* Задание 1. */
        int salary = 15000;
        int total = 0;
        int month = 0;
        double percent = 10 / 100;
        while (total < 2_459_000) {
            total += salary;
            total = (int) (total * (1 - percent));
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }


        /* Задание 2. */
        {
            int k = 1;
            while (k <= 10) {
                System.out.print(k + " ");
                k = k + 1;
            }
        }
        System.out.println();
        for (int k = 10; k >= 1; k = k - 1) {
            System.out.print(k + " ");
        }

        System.out.println();

        /* Задание 3. */
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int year = 0;
        while (year <= 10) {
            int bornThisYear = (population / 1000) * birthRate;
            int mortalThisYear = (population / 1000) * mortalityRate;
            population = (population + bornThisYear) - mortalThisYear;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        /* Задание 4. */
        int deposit = 15000;
        int percentPerMonth = 7;
        while (deposit < 12_000_000) {
            int percent2 = (deposit * percentPerMonth) / 100;
            deposit = deposit + percent2;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit);
        }

        /* Задание 5. */
        deposit = 15000;
        month = 0;
        while (deposit < 12_000_000) {
            int percent2 = (deposit * percentPerMonth) / 100;
            deposit = deposit + percent2;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit);
            }
        }

        /* Задание 6. */
        int deposit2 = 15000;
        int percentPerMonth2 = 7;
        while (month < 12 * 9) {
            int percent3 = (deposit2 * percentPerMonth2) / 100;
            deposit2 = deposit2 + percent3;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + deposit2);
            }
        }

        /* Задание 7. */
        int friday = 5;
        int daysMonth = 31;

        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);

        /* Задание 8. */
        int period = 79;
        int start = 0;
        int realYear = 2024;
        int startYear = realYear - 200;
        int finalYear = realYear + 100;
        for (int i = start; i < finalYear; i += period) {
            if (i > startYear) {
                System.out.println(i);
            }
        }
    }
}







