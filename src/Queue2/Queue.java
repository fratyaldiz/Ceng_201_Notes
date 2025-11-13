package Queue2;

public class Queue {
    Node front; //head
    Node rear;  //tail
    int size;
    int cnt;    //Counter

    public Queue(int size){
        this.size=size;
        cnt=0;
        front=null;
        rear=null;
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            Node node =new Node(data);

            if(isEmpty()){
                front= rear = node;
                System.out.println(data + " is added to queue");
            }
            else{
                rear.next= node;
                rear=rear.next;
                System.out.println(data + " is added to queue");
            }
            cnt++;
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.data + " is removed from queue");
            front = front.next;
            cnt--;
        }
    }
    private boolean isEmpty(){
        return cnt==0;
    }
    private boolean isFull() {
        return cnt==size;
    }

    void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            Node temp=front;
            System.out.print("first <- ");
            while(temp!=null){
                System.out.print(temp.data + " <- ");
                temp=temp.next;
            }
            System.out.print(" last");
        }
    }
}
