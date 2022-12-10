package Main.fmethod.AbstractFactory;

import Main.fmethod.AbstractFactory.PhoneFactory.Phone;
import Main.fmethod.AbstractFactory.TVFactory.TV;

public interface FactoryTest {
    TV createTV(String typeOfTV);
    Phone createPhone(String typeOfPhone);
}
