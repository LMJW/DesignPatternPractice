package withPattern;

public class Mocha extends Condiment {
    
    public Mocha(Beverage b){
        beverage = b;
    }

    public String getDescription(){
        return String.format("%s, with chocolate", beverage.getDescription());
    }

    public double cost(){
        return 2.0 + beverage.cost();
    }
}