public class Main {
    public static void main(String[] args) {
        //Exercise 1

        //Integer variables
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 500;
        long longVar = 10_000_000_000L;

        //Float-point variables
        float floatVar = 0.25f;
        double doubleVar = 1.0;

        //Symbol variable
        char charVar = 'A';

        //Logical variable
        boolean booleanVar = true;

        //Exercise 2
        System.out.println("\n-----Exercise 2-----");
        double weight1 = 78.2;
        double weight2 = 82.7;
        double totalWeight = weight1 + weight2;
        double differenceWeight = weight2 - weight1;

        System.out.println("Total weight: " + totalWeight);
        System.out.println("Difference weight: " + differenceWeight);

        //Exercise 3
        System.out.println("\n-----Exercise 3-----");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;

        double sumGr = banana + milk + iceCream + egg;
        double sumKg = sumGr / 1000.0;
        System.out.println("Breakfast's weight (in kgs): " + sumKg);

        //Exercise 4
        System.out.println("\n-----Exercise 4-----");
        int startWeight = 7 * 1000;
        int loss1 = 250;
        int loss2 = 500;

        int countDays1 = startWeight / loss1;
        int countDays2 = startWeight / loss2;
        int average = (countDays1 + countDays2) / 2;

        System.out.println("If the sportsman loses 250 grams every day, " +
                "he'll achieve his goal in " + countDays1 + " days");
        System.out.println("If the sportsman loses 500 grams every day, " +
                "he'll achieve his goal in " + countDays2 + " days");
        System.out.println("Average: " + average + " days");

        //Exercise 5
        System.out.println("\n-----Exercise 5-----");
        double mashaCurrent = 67760;
        double denisCurrent = 83690;
        double kristinaCurrent = 76230;

        double mashaNext = 1.1 * mashaCurrent;
        double denisNext = 1.1 * denisCurrent;
        double kristinaNext = 1.1 * kristinaCurrent;

        System.out.println("Masha's salary is " + mashaNext + ". Her salary increased by " + (mashaNext - mashaCurrent));
        System.out.println("Denis's salary is " + denisNext + ". His salary increased by " + (denisNext - denisCurrent));
        System.out.println("Kristina's salary is " + kristinaNext + ". Her salary increased by " + (kristinaNext - kristinaCurrent));
    }
}