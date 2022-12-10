package Main.fmethod.FactoryMethod;

public class WebButton implements Button {
    @Override
    public void createButton() {
        System.out.println("It's a web button!");
    }
}
