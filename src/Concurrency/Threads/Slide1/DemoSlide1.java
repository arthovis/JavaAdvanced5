package Concurrency.Threads.Slide1;

public class DemoSlide1 {
    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.start();

        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");

    }
}
