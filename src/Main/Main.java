package Main;

import Main.fmethod.AbstractFactory.AbstractFactory;
import Main.fmethod.AbstractFactory.FactoryTest;
import Main.fmethod.Builder.Builder;
import Main.fmethod.Builder.ConcreteBuilder;
import Main.fmethod.Builder.Director;
import Main.fmethod.Builder.Product;
import Main.fmethod.FactoryMethod.*;
import Main.fmethod.Singleton.Singleton;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        String Choise = "1";
        while (Choise != "0"){
            System.out.println("Введите номер паттерна: 1 - Singleton, 2 - Abstract Factory, 3 - Factory Method, 4 - Builder\nВведите другой символ для выхода из программы");
            Choise = Input.nextLine();
            switch (Choise){
                case "1" : {
                    // Singleton
                    Singleton instance = Singleton.getInstance();
                    break;
                }
                case "2" : {
                    // AbstractFactory
                    System.out.println("Введите называние фабрики из списка: TV, Phone");
                    FactoryTest factoryTest = new AbstractFactory().createFactory(Input.nextLine());
                    if (factoryTest != null)
                        System.out.println("Создан " + factoryTest.getClass());
                    break;
                }
                case "3" : {
                    // FactoryMethod
                    Dialog dialog = null;
                    Configuration conf = new Configuration("WEB");
                    if (conf.getPlatform() == "WEB") dialog = new WebDialog();
                    else if (conf.getPlatform() == "MOB") dialog = new MobDialog();
                    else System.out.println("Такой платформы не существует!");

                    if (dialog != null) dialog.render();
                    break;
                }
                case "4" : {
                    // Builder
                    Builder builder = new ConcreteBuilder();
                    Director director = new Director(builder);
                    Product product = director.createProduct();
                    product.result();
                    break;
                }
                default:{return;}
            }
        }
    }
}

