import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }
    public long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }
    public long stop() {
        this.endTime = System.currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch now = new StopWatch();
        System.out.println(now.start());
        int[] arr = new int[100000];
        for (int i = 0; i<100000; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        Arrays.sort(arr);
        System.out.println(now.stop());
        System.out.println(now.getElapsedTime());
    }
}
