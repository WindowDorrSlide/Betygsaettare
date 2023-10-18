import java.util.Scanner;

public class betygsattare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Hur många poäng har eleven? (Int)");
        int betyg = scn.nextInt();

        if (betyg > 30 || betyg < 0)    {
            System.out.println("Att få detta antal poäng är ej möjligt, avbryter");
            System.exit(0);
        }

        if (betyg >= 27)    {
            System.out.println("Eleven får ett A enligt mallen");
        } else if (betyg >= 24) {
            System.out.println("Eleven får ett B enligt mallen");
        } else if (betyg >= 21) {
            System.out.println("Eleven får ett C enligt mallen");
        } else if (betyg >= 18) {
            System.out.println("Eleven får ett D enligt mallen");
        } else if (betyg >= 15){
            System.out.println("Eleven får ett E enligt mallen");
        }   else    {
            System.out.println("Eleven är undergodkänt enligt mallen");
        }

    }
}