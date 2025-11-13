package Ders7;

import java.util.Scanner;

public class CircularDoublyLinkedList {

    Scanner scanner=new Scanner(System.in);

    Node head = null;
    Node tail  = null;

    Node temp = null;

    int data;
    int indis;

    void addToHead() {
        System.out.print("Data: ");
        data = scanner.nextInt();

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    void addToTail() {
        System.out.print("Data: ");
        data = scanner.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail =  newNode;
            tail.next = head;
            head.prev = tail;
        }
    }

    void addToMiddle() {
        System.out.print("İndis: ");
        indis = scanner.nextInt();
        System.out.print("Data: ");
        data = scanner.nextInt();

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node temp = head;
        int n = 0;
        do {
            n++;
            temp = temp.next;
        } while (temp != head);

        if (indis <= 0) {
            addToHead();
            return;
        }

        else if (indis >= n) {
            addToTail();
            return;
        }

        else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < indis; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = newNode;
            newNode.prev = previous;

            newNode.next = current;
            current.prev = newNode;
        }
    }

    void print(){
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            System.out.print("First -> ");

            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);

            System.out.print(" (Circular List Completed)");
        }
        System.out.println();
    }

    void deleteFromHead() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if(head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

    }
    void deleteFromTail() {
        if (tail == null) {
            System.out.println("List is empty");
        }
        else if(tail == head) {
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    void deleteFromMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Indis: ");
        int indis = scanner.nextInt();

        // 1. Liste uzunluğunu doğru hesapla
        int size = 0;
        if (head != null) {
            Node current = head;
            do {
                size++;
                current = current.next;
            } while (current != head);
        }

        // 2. İndis Geçerlilik Kontrolü
        if (indis < 0 || indis >= size) {
            System.out.println("Hata: Gecersiz indis. Liste boyutu: " + size);
            return;
        }

        // 3. Özel Durumlar (Baştan ve Sondan Silme)
        if (indis == 0) {
            deleteFromHead();
            return;
        }
        if (indis == size - 1) {
            deleteFromTail();
            return;
        }

// 4. Aradan Silme
// Bu noktada: 0 < indis < size - 1 olduğu varsayılır.

        Node temp = head; // temp, silinecek düğümü bulmak için kullanılır

// Silinecek düğüme (temp) ulaş
        for (int i = 0; i < indis; i++) {
            temp = temp.next;
        }

// temp artık silinecek düğümdür (S).
// P = temp.prev
// N = temp.next

// 1. P'nin (temp.prev) next'ini N'ye (temp.next) bağla.
        temp.prev.next = temp.next;

// 2. N'nin (temp.next) prev'ini P'ye (temp.prev) bağla.
        temp.next.prev = temp.prev;
    }
}