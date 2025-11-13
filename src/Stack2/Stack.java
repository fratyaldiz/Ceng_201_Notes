package Stack2;

public class Stack {
    int size;
    int cnt;

    Node top;

    public Stack(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data){
        Node node = new Node(data);

        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            if(isEmpty()){
                top = node;
                System.out.println(top.data + " added from stack.");
            }
            else{
                node.next = top;
                top = node;
                System.out.println(top.data + " added from stack.");
            }
            cnt++;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data + " removed from stack.");
            top = top.next;
            cnt--;
        }
    }
    void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
    void printTop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is " + top.data);
        }
    }

    boolean isFull(){
        return cnt == size;
    }
    boolean isEmpty(){
        return cnt == 0;
    }
}
