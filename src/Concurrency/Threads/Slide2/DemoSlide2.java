package Concurrency.Threads.Slide2;

public class DemoSlide2 {
    public static void main(String[] args) {
        Thread stopWatchThread = new Thread(new StopWatchThread());
        stopWatchThread.start();
        
    }
}
