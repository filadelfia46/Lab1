package Main.fmethod.FactoryMethod;

public class MobButton implements Button{
    @Override
    public void createButton() {
        System.out.println("It's a mob button!");
    }
}
