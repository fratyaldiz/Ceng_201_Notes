package CarGalleryApp;

import java.util.Scanner;

public class LinkedList {

    Scanner scanner = new Scanner(System.in);
    OtoNode head=null;
    OtoNode tail=null;

    String plate;
    String Brand;
    String model;
    String colour;
    double purchasePrice;
    double salePrice;
    String information;

    void add(){
        System.out.println("Enter the Car information to be added to the car gallery. ");
        System.out.print("Plate: "); this.plate = scanner.nextLine();
        System.out.print("Brand: "); this.Brand = scanner.nextLine();
        System.out.print("Model: "); this.model = scanner.nextLine();
        System.out.print("Colour: "); this.colour = scanner.nextLine();
        System.out.print("Purchase price: "); this.purchasePrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Information: "); this.information = scanner.nextLine();

        OtoNode car =new OtoNode(plate,Brand,model,colour,purchasePrice,information);

        if(head==null){
            head=car;
            tail=car;
            tail.next=head;
            System.out.println("Car with plate " + plate + " has been added to the car gallery.");
        }
        else{
            car.next=head;
            head=car;
            tail.next=head;
            System.out.println("Car with plate " + plate + " has been added to the car gallery.");
        }
    }

    void delete(){
        if(head==null){
            System.out.println("There is no car in the car gallery.");
        }
        else {
            System.out.println("Enter the plate o the car to be sold: "); plate = scanner.nextLine();

            if(head ==tail && head.plate.equals(plate)){
                System.out.println("The " + plate + " car was sold for " + head.salePrice + "TL.");
                head = null;
                tail = null;
            }
            else if(head !=tail && head.plate.equals(plate)){
                System.out.println("The " + plate + " car was sold for " + head.salePrice + "TL.");
                head = head.next;
                tail = head;
            }
            else{
                OtoNode temp=head;
                OtoNode temp2=temp;

                while(temp!=tail) {
                    if(temp.plate.equals(plate)){
                        System.out.println("The " + plate + " car was sold for " + temp.salePrice + "TL.");
                        temp2.next=temp.next;
                    }
                    temp2=temp;
                    temp=temp.next;
                }
                if(temp.plate.equals(plate)){
                    System.out.println("The " + plate + " car was sold for " + temp.salePrice + "TL.");
                    tail = temp2;
                    tail.next=head;
                }
            }
        }
    }

    void print(){
        if(head==null){
            System.out.println("There is no car in the car gallery.");
        }
        else{
            System.out.println("Plate\tBrand\tModel\tColour\tPurchasePrice\tInformation");

            OtoNode temp=head;
            while(temp!=tail){
                System.out.println(temp.plate + "\t" + temp.Brand + "\t" + temp.model + "\t" + temp.colour + "\t" + temp.purchasePrice + "\t" + temp.information);
                temp =temp.next;
            }
            System.out.println(temp.plate + "\t" + temp.Brand + "\t" + temp.model + "\t" + temp.colour + "\t" + temp.purchasePrice + "\t" + temp.information);

        }
    }

    void findCar(){
        if(head==null){
            System.out.println("There is no car in the car gallery.");
        }
        else{
            boolean result = false;
            System.out.println("The plate of the car you are looking for is " + head.plate + ".");
            OtoNode temp=head;
            OtoNode temp2=temp;

            while(temp!=tail){

                if(temp.plate.equals(plate)){
                    temp2 =  temp;
                    result = true;
                }
                temp = temp.next;
            }
            if(temp.plate.equals(plate)){
                temp2=temp;
                result = true;
            }

            if(result == false){
                System.out.println("The car with plate "+ plate + " is not found.");
            }
            else{
                System.out.println("Car information with plate " + plate +" :");
                System.out.println("Plate: " + temp2.plate);
                System.out.println("Brand: " + temp2.Brand);
                System.out.println("Model: " + temp2.model);
                System.out.println("Colour: " + temp2.colour);
                System.out.println("PurchasePrice: " + temp2.purchasePrice);
                System.out.println("SalePrice: " + temp2.salePrice);
                System.out.println("Information: " + temp2.information);
            }

        }
    }
}
