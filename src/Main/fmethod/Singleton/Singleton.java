package Main.fmethod.Singleton;

public final class Singleton { // final - значит что нет подклассов
    private static Singleton instance = null;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
            System.out.println("Класс Singleton создан\n");
        return instance;
    }
}
