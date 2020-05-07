package withPattern;

public class Milk extends Condiment {
    public Milk(Beverage b){
        beverage = b;
    }

    public String getDescription(){
        return String.format("%s, milk", beverage.getDescription());
    }
    
    public double cost(){
        return 1.0 + beverage.cost();
    }
}