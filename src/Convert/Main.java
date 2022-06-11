package Convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter exchange rate of dollars ");
        Scanner scanner = new Scanner(System.in);
        double dollars = scanner.nextDouble();
        System.out.println("Enter sum of rubles ");
        double rubles= scanner.nextDouble();
        double itog=rubles/dollars;
        //String itog1=Double.toString(itog);
        String itog2=String.format("%.2f",itog);
        System.out.println("Itog:"+ itog2);
    }


}
