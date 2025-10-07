public class Currency {
    private double value;
    private String name;
    private int quantity;
    
    public Currency(double value, String name) {
        this(value, name, 0);
        
    }
    
    public Currency(double value, String name, int quantity) {
        this.value = value;
        this.name = name;
        this.quantity = quantity;
        
    }
    
    public double getValue() {
        return value;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTotal() {
        return value * quantity;
    }

    @Override
    public String toString() {
        return (quantity + "" + name);
    }
    


}