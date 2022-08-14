public class Main {
    public static void main(String[] args) {
   // Задание 1
        byte cat = 5;
        short dog = 7;
        int mouse = 11;
        long pig = 100L;
        double catWeight = 1.5;
        float catAdult = 23.5f;

   // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOffAllBoxers);
        System.out.println("Разница в весе " + weightDifference);

    //Задание 3
        short oneBananaWeight = 80 * 5;
        short oneMilkWeight = 105 * 2;
        short oneIceCreamWeight = 100 * 2;
        short oneEggWeight = 70 * 4;
        int weightOfTheBreakfast = oneBananaWeight + oneMilkWeight + oneIceCreamWeight + oneEggWeight;
        float theBreakfastWeightInKilograms = weightOfTheBreakfast / 1000f;
        System.out.println("Вес завтрака " + weightOfTheBreakfast);
        System.out.println ("Вес завтрака в килограммах " + theBreakfastWeightInKilograms);

    //Задание 4
        byte weightToLose = 7;
        int weightToLoseInOneDay1 = 250;
        int weightToLoseInOneDay2 = 500;
        double daysToLoseWeight1 = 7 / 0.250;
        double daysToLoseWeight2 = 7 / 0.500;
        double daysToLoseWeightInGeneral = daysToLoseWeight1 + daysToLoseWeight2 / 2;
        System.out.println(daysToLoseWeight1 + " дней займет потеря веса при потере 250 грамм");
        System.out.println(daysToLoseWeight2 + "дней займет потеря веса при потере 500 грамм");
        System.out.println("Потеря веса займет в среднем" + daysToLoseWeightInGeneral + " дней");




    }
}
