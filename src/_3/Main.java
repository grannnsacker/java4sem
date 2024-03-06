package _3;

public class Main {
    public static void main(String[] args) {
        SemaphoreList<Integer> sl = new SemaphoreList<Integer>(1, 3, 5);
        Thread thread = new Thread(() -> {
            System.out.println(sl.size()+" from Thread");
        });
        thread.start();
        System.out.println(sl.size()+ " from main thread");
    }
}
