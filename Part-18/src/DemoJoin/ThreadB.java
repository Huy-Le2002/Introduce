package DemoJoin;

public class ThreadB implements Runnable{
    ThreadA threadA;
    public ThreadB() {
    }
    public ThreadB(ThreadA threadA) {
        this.threadA = threadA;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("ThreadB: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
