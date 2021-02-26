package clase05_Java3.sorts;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long elapsedTime() {
        return this.endTime - this.startTime;
    }
}
