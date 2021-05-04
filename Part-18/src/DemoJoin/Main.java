package DemoJoin;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("THread main start");
        ThreadA threadA = new ThreadA();
            threadA.start();
        ThreadB t = new ThreadB();
        Thread threadB = new Thread(t);
            threadB.start();
//        threadA.join();
//        threadB.join();
//        try {
//            Thread.sleep(4000);
//            threadA.stop();
//            t.stop();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
