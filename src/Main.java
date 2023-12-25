public class Main {
    public static void main ( String[] args ) {
        int money = 15_000;
        int total = 0;
        int month = 0;
        while ( total < 2_459_000 ) {
            total = total + money;
            month = month + 1;
            System.out.println ( "За " + month + " месяц сумма накоплений равна " + total );
        }
        int i = 0;
        while ( i < 10 ) {
            i = i + 1;
            System.out.print ( i + " " );
        }
        System.out.println ( );

        for ( int d = 10; d > 0; d = d - 1 ) {
            System.out.print ( d + " " );
        }

        System.out.println ( );

        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        int populationGrowth = birthRate - deathRate;
        int populationNew = population;
        int a = 0;


        while ( a < 10 ) {
            a = a + 1;
            populationNew = populationNew + populationGrowth;
            System.out.println ( "год " + a + " численность населения составляет " + populationNew );
        }

        int saveMoney = 15_000;
        int totalMoney = 0;
        int months = 0;
        while ( totalMoney < 2000000 ) {
            totalMoney = totalMoney + totalMoney / 100 * 7;
            totalMoney = totalMoney + saveMoney;
            months = months + 1;

            if ( months % 6 == 0 ) {
                System.out.println ( "за " + months + " месяцев Василию удалось накопить " + totalMoney );
            }
        }


        int saveM = 15_000;
        int totalSaved = 0;
        months = 0;
        while ( months <= 108 ) {
            totalSaved = totalSaved + totalSaved / 100 * 7;
            totalSaved = totalSaved + saveM;
            months = months + 1;

            if ( months % 6 == 0 ) {
                System.out.println ( "за " + months + " месяцев Василию удалось накопить " + totalSaved );
            }
        }

        int friday = 3;
        while ( friday <= 24 ) {
            if ( friday <= 7 ) {
                System.out.println ( "Сегодня пятница " + friday + "-е число" );
            }
            friday = friday + 7;
            System.out.println ( "Сегодня пятница " + friday + "-е число" );
        }

        int cometTime = 79;
        int year = 0;
        while ( year <= 2044 ) {
            year = year + cometTime;
            if ( year > 1823 ) {
                System.out.println ( year );
            }

        }
    }
}










