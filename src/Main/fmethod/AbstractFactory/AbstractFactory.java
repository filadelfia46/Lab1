package Main.fmethod.AbstractFactory;

import Main.fmethod.AbstractFactory.PhoneFactory.PhoneFactory;
import Main.fmethod.AbstractFactory.TVFactory.TVFactory;

public class AbstractFactory {
    public FactoryTest createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "TV": return new TVFactory();
            case "Phone": return new PhoneFactory();
            default:
                System.out.println(typeOfFactory + " is unknown type of Factory");
                return null;
        }
    }

}
