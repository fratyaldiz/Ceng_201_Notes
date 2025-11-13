package pdf;

public class Node {
    int data;
    Node next;
    Node prev;
    Node(int val){
        data = val;
        next = null;
        prev = null;
    }
}