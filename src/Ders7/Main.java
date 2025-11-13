package Ders7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n1- Add to head of list.");
            System.out.println("2- Add to tail of list.");
            System.out.println("3- Add to middle of list.");
            System.out.println("4- Remove from head of list.");
            System.out.println("5- Remove from tail of list.");
            System.out.println("6- Remove from middle of list.");
            System.out.println("0- Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                list.addToHead();
            }
            else if (choice == 2) {
                list.addToTail();
            }
            else if (choice == 3) {
                list.addToMiddle();
            }
            else if (choice == 4) {
                list.deleteFromHead();
            }
            else if (choice == 5) {
                list.deleteFromTail();
            }
            else if (choice == 6) {
                list.deleteFromMiddle();
            }
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
            list.print();
        }
        scanner.close();
    }
}
