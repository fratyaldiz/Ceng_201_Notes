package Queue1;

public class Main {
    public static void main(String[] args) {


        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(70);
    }
}
