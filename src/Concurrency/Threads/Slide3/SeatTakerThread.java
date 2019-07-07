package Concurrency.Threads.Slide3;

public class SeatTakerThread extends Thread {
    private Bench bench;

    public SeatTakerThread(Bench bench){
        this.bench = bench;
    }

    @Override
    public void run(){
        bench.takeSeat();
    }
}
