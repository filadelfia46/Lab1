package Main.fmethod.Builder;

public class Product {
    private String a;
    private  String b;
    private String c;
    private  String d;

    public Product() {
    }

    public Product (String a, String b, String c, String d) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d =d;
    }

    public void result () {
        String s = "passed stages: "+a+", "+b+", "+c+", "+d;
        System.out.println(s);
    }
}
