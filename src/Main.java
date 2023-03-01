public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    private static void task8() {
        System.out.println("Задача 8");
         int yearNow = 2023;
         int startPeriod = yearNow - 200;
         int finishPeriod = yearNow + 100;
         for (int year = 79; year < finishPeriod; year += 79){
             if (year > startPeriod && year < finishPeriod) {
                 System.out.println(year);
             }

         }

    }

    private static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (; firstFriday <= 31; firstFriday += 7){
            System.out.println("Сегодня пятница," + firstFriday+ "-е число. Необходимо подготовить отчет");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        int total = 0;
        for (int months = 1; months < 9*12; months++){
            total = total + deposit ;
            total = total + total /100*7;
            if (months%6==0)
           System.out.println("накопления " + total+ " месяц " + months);

        }

    }

    private static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int month = 1;
        for (int total = 0; total < 12_000_000; month++ ){
            total = total + (total/100*7);
            total = total + deposit;
            if (month % 6 == 0)
            System.out.println( "Месяц " + month+ " накоплений " +total);
        }



    }

    private static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        int month = 1;
        for (int total = 0; total < 12_000_000; month++ ){
            total = total + (total/100*7);
            total = total + deposit;
            System.out.println( "Месяц " + month+ " накоплений " +total);


        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * 7;
        int mortality = population / 1000 * 8;
        for (int year = 1; year <= 10; year++){
            population = population + birthRate - mortality;
            System.out.println("Год " + year + " численность населения составляет " + population);
    }

}

    private static void task2() {
        System.out.println("Задача 2");
        int x = 0;
        while ( x < 10 ) {
            x = x+1;
            System.out.print(" " + x);
        }
    System.out.println();
    for (; x > 0; x--){
        System.out.print(" "+ x);
        }
        System.out.println();
    }


    private static void task1() {
        System.out.println("Задача 1");
        int deposit = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_495_000) {
            int m = month++;
            total = total + deposit;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total + " рублей");
        }
    }
}


