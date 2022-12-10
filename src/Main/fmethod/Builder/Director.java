package Main.fmethod.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        super();
        this.builder = builder;
    }
    public Product createProduct () {
        Product newProduct = builder.doA().doB().doC().doD().build();
        return newProduct;
    }
}


