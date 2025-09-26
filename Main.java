import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the amount of Money: ");
        System.out.println("\n");

        ArrayList<CurrencyDenomination> money = new ArrayList<>();
        money.add(new CurrencyDenomination(100, "one hundred dollar bills"));
        money.add(new CurrencyDenomination(50, "fifty dollar bills"));
        money.add(new CurrencyDenomination(20, "twenty dollar bills"));
        money.add(new CurrencyDenomination(10, "ten dollar bills"));
        money.add(new CurrencyDenomination(5, "five dollar bills"));
        money.add(new CurrencyDenomination(2, "two dollar bills"));
        money.add(new CurrencyDenomination(1, "one dollar bills"));

        input.close();    
        
    }

    public static ArrayList<CurrencyDenomination> reverseMergeSort(
        ArrayList<CurrencyDenomination> money
    ) {
        return money;
    }
}