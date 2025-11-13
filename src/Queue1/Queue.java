package Queue1;

public class Queue {
    int[]  array;
    int size;
    int front;  //head
    int rear;   //tail

    public Queue(int size) {
        this.size=size;
        array =new int[size];   //Kuyruk yapısı
        front = 0;
        rear = -1;
    }
    void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            array[rear] = data;
            System.out.println(array[rear] + " enqueued");
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            int num = array[front];
            for(int i=1;i<rear;i++){
                array[i-1] = array[i];
            }
            rear--;
            System.out.println(num + " dequeued");
        }
    }
    private boolean isEmpty(){
        return rear == -1;
    }
    private boolean isFull(){
        return rear == size - 1;
    }

    void countOfElements(){
        System.out.println("Number of elements in queue: " + (rear+1));
    }

    void printQueue(){
        int i= rear;
        System.out.println("Last -> ");
        while(i>0){
            System.out.print(array[i]+" -> ");
            i--;
        }
        System.out.println(" Empty");
    }
}
