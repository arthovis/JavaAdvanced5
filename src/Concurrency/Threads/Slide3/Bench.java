package Concurrency.Threads.Slide3;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeSeat(){
        if (availableSeats>0){
            System.out.println("Taking a seat.");
            availableSeats--;
            System.out.println("Free seats left: "+availableSeats);
        } else {
            System.out.println("No more seats left");
        }
    }
}
