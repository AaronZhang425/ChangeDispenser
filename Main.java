import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency(100, "One hundred dollar bills"));
        currencies.add(new Currency(50, "Fifty dollar bills"));
        currencies.add(new Currency(20, "Twenty dollar bills"));
        currencies.add(new Currency(10, "Ten dollar bills"));
        currencies.add(new Currency(5, "Five dollar bills"));
        currencies.add(new Currency(2, "Two dollar bills"));
        currencies.add(new Currency(1, "One dollar bills"));
        
        Wallet money = new Wallet(currencies);

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the amount of Money: ");
        System.out.println("\n");


        input.close();    
        
    }

}