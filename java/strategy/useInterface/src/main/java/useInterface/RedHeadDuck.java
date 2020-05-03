package useInterface;



public class RedHeadDuck extends Duck implements Flyable, Quackable {
    public String fly(){
        return "I can fly";
    }
    public String quack(){
        return "I can quack";
    }
}