package Stack1;

public class Stack {
    int dizi[];
    int size;
    int indis;
    public Stack(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }

    void push(int data) {
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            indis++;
            dizi[indis] = data;
            System.out.println("push () : " + dizi[indis]);
        }
    }
    int pop(){
        if (!isEmpty()){
            return dizi[indis --];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    boolean isFull(){
        return (indis == size-1);
    }
    boolean isEmpty(){
        return (indis == -1);
    }
}
