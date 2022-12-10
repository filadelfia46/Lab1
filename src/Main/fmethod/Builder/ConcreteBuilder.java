package Main.fmethod.Builder;

public class ConcreteBuilder implements Builder {

    private String a;
    private  String b;
    private String c;
    private  String d;

    public ConcreteBuilder () {
    }


    @Override
    public Builder doA() {
        System.out.println("It adds an a-type");
        this.a = "1st stage";
        return this;
    }

    @Override
    public Builder doB() {
        System.out.println("It adds a b-type");
        this.b = "2nd stage";
        return this;
    }

    @Override
    public Builder doC() {
        System.out.println("It adds a c-type");
        this.c = "3rd stage";
        return this;
    }

    @Override
    public Builder doD() {
        System.out.println("It adds a d-type");
        this.d = "4th stage";
        return this;
    }

    public Product build () {
        Product product = new Product(a, b, c, d);
        System.out.println("--------------------------");
        System.out.println("Now your product is ready!");
        return product;
    }
}
