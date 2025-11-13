package OtoPark;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        int choice=-1;

        while(choice !=0){
            System.out.println("1- Car entry");
            System.out.println("2- Car exit");
            System.out.println("3- Print cars in OtoPark");
            System.out.println("4- Total Price in OtoPark");
            System.out.println("0- Exit");
            System.out.println("Enter your choice: ");choice = scanner.nextInt();

            switch(choice){
                case 1:list.add();break;
                case 2: list.delete();break;
                case 3:list.print();break;
                case 4: System.out.println("Total price: " + list.totalPrice);break;
                case 0: System.out.println("Exit");break;
                default:System.out.println("Invalid choice");break;

            }
        }
    }
}
