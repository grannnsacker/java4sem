package _5;

public class Main {
    public static void main(String[] args) {
        Singleton__ value = Singleton__.instance;
        Singleton__ value2 = Singleton__.instance;
        System.out.println(value == value2);
    }
}
