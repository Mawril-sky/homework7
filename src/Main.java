//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int firstFriday = 10;

        for (int day = 1; day <= 31; day++) {

            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        //Задача 2
        int distance = 0;
        final int totalDistance = 42195;
        final int step = 500;

        do {
            System.out.println("Держитесь! Осталось " + (totalDistance - distance) + " метров");
            distance += step;
        } while (distance < totalDistance);

        final int totalDistance1 = 42195;
        final int step1 = 500;
        for (int distance1 = 0; distance1 < totalDistance1; distance1 += step1) {
            System.out.println("Держитесь! Осталось " + (totalDistance1 - distance1) + " метров");
        }
        //Задача 3
        int budget = 1000;
        int costPerDay = 100;
        int currentDay = 0;
        int remainingBudget = budget;

        while (remainingBudget >= costPerDay) {
            currentDay++;
            if (currentDay % 5 == 0) {
                continue;
            }
            remainingBudget -= costPerDay;
            break;
        }
        System.out.println("Оплаты хватит: на " + currentDay + " дней хватит бюджета.");

        int budget1 = 5000;
        int costPerDay1 = 100;
        int remainingBudget1 = budget1;
        int daysCount1 = 0;
        for (int day = 1; remainingBudget1 >= costPerDay1; day++) {
            daysCount1++;

            if (day % 5 == 0) {

                remainingBudget1 -= costPerDay1;
            }

            System.out.println("Версия с for: на " + daysCount1 + " дней хватит бюджета.");
        }
        //Задача 4
        int month = 0;
        int total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;

            }
            System.out.println("Месяц " + month + ": " + total + " ₽");
            if (total >= 12000000) {
                break;
            }
        }
        //Задача 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;

                if (overheats > 3) {
                    System.out.println("Зарядка завершена досрочно из‑за превышения допустимого количества перегревов.");
                    break;
                }

                System.out.println("Перегрев! Пропускаем зарядку на 2 минуты.");
                continue;
            }
            charge += 2;
            if (charge == 100) {
                charge = 100;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }

}


