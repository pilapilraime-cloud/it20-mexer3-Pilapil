package tickettriage;
import java.util.PriorityQueue;
import java.util.Comparator;

class Ticket {
    String name;
    int urgency;

    public Ticket(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return name + " (" + urgency + ")";
    }
}

public class TicketTriage {
    public static void main(String[] args) {

        
        PriorityQueue<Ticket> queue = new PriorityQueue<>(
            Comparator.comparingInt(ticket -> ticket.urgency)
        );

        
        queue.offer(new Ticket("Printer", 3));
        queue.offer(new Ticket("Network", 1));
        queue.offer(new Ticket("Login", 2));

       
        System.out.println("Ticket Triage Queue:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}