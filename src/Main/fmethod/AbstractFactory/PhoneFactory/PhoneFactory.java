package Main.fmethod.AbstractFactory.PhoneFactory;

import Main.fmethod.AbstractFactory.FactoryTest;
import Main.fmethod.AbstractFactory.TVFactory.TV;

public class PhoneFactory implements FactoryTest {
    @Override
    public TV createTV(String typeOfTV) {
        return null;
    }

    public Phone createPhone(String TypeOfPhone){
        switch (TypeOfPhone){
            case "IPhone": return new IPhone();
            case "Samsung": return new Samsung();
            case "Xiaomi": return new Xiaomi();
            default:
                System.out.println(TypeOfPhone + " is unknown type of Phone");
                return null;
        }
    }
}
