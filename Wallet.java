import java.util.ArrayList;

public class Wallet {
    private ArrayList<Currency> currencies;

    public Wallet(ArrayList<Currency> currencies) {
        this.currencies = currencies;

        reverseMergeSort(this.currencies);
    }

    private ArrayList<Currency> reverseMergeSort (ArrayList<Currency> currencies) {
        return currencies;
    }
}
