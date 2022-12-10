package Main.fmethod.AbstractFactory.TVFactory;

import Main.fmethod.AbstractFactory.FactoryTest;
import Main.fmethod.AbstractFactory.PhoneFactory.Phone;

public class TVFactory implements FactoryTest {
    public TV createTV(String TypeOfTV){
        switch (TypeOfTV){
            case "Phillips": return new Phillips();
            case "LG": return new LG();
            case "Country TV": return new CountryTV();
            default:
                System.out.println(TypeOfTV + " is unknown type of TV");
                return null;
        }
    }

    @Override
    public Phone createPhone(String typeOfPhone) {
        return null;
    }
}
