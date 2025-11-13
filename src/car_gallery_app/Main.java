package car_gallery_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanenr = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice = -1;
        while(choice != 0){
            System.out.println("1- Car add");
            System.out.println("2- Car delete");
            System.out.println("3- Cars print");
            System.out.println("4- Car search");
            System.out.println("0- For exit");
            System.out.println("Enter your choice");choice  = scanenr.nextInt();
            switch(choice){
                case 1: list.add(); break;
                case 2: list.delete(); break;
                case 3: list.print(); break;
                case 4: list.findCar(); break;
                case 0: System.out.println("Exiting..");break;
                default: System.out.println("Invalid choice.");break;
            }
        }
    }
}
