import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the amount of Money: ");
        System.out.println("\n");

        ArrayList<CurrencyDenomination> money = new ArrayList<>();
        money.add(new CurrencyDenomination(10, "ten dollar bill"));



        input.close();
        
        
    }
}