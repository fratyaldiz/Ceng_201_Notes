package pdf;

public class DLL {
    Node head;

    public static Node getNode(int data) {
        return new Node(data);
    }


    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public static Node sortedInsert(Node head, Node newNode) {
        Node current;

        if (head == null) {
            head = newNode;
        }

        else if (head.data >= newNode.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        else {
            current = head;

            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }

            newNode.next = current.next;

            if (current.next != null) {
                newNode.next.prev = newNode;
            }

            current.next = newNode;
            newNode.prev = current;
        }

        return head;
    }


    static int findSize(Node node){
        int res = 0;
        while(node!=null){
            res++;
            node = node.next;
        }
        return res;
    }

    void deleteNode(Node del){
        if(head ==null || del == null){
            return;
        }
        if(head ==del){
            head = del.next;
        }
        if(del.next != null){
            del.next.prev = del.prev;
        }
        if(del.prev != null){
            del.prev.next = del.next;
        }
        return;
    }


    public static void printList(Node head){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void printlist(){
        printList(head);
    }
}