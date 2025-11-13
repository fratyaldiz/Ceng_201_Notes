package OtoPark;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CircularDoublyLinkedList {
    Scanner scanner = new Scanner(System.in);

    OtoNode  head = null;
    OtoNode tail = null;
    OtoNode temp =head;
    OtoNode temp2 =temp;


    String plate;
    String enter;
    String exit;
    long minutes;
    long price;
    long totalPrice = 0;

    void add(){
        System.out.print("Plate: "); plate = scanner.nextLine();
        System.out.print("Enter: (HH:mm) "); enter = scanner.nextLine();

        OtoNode car = new OtoNode(plate,enter);

        if(head == null){
            head = car;
            tail = car;
            head.next = tail;
            head.prev = head;
            System.out.println("The car entered the otopark.");
        }
        else{
            car.next = head;
            car.prev = tail;

            head.prev = car;
            tail.next = car;

            head = car;
            System.out.println("The car entered the otopark.");
        }
    }

    void delete()throws ParseException{
        if(head == null){
            System.out.println("There is nothing to delete");
        }
        else{
            System.out.print("Plate: "); plate = scanner.nextLine();
            System.out.print("Exit: (HH:mm) "); exit = scanner.nextLine();

            if (head ==tail && head.plate.equals(plate)){
                calculateThePrice(head,exit);
                head = null;
                tail = null;
                System.out.println("The car exit the otopark.");
            } else if (head !=tail && head.plate.equals(plate)) {
                calculateThePrice(head,exit);
                head = head.next;
                head.prev = tail;
                tail.next = head;
                System.out.println("The car exit the otopark.");
            }
            else {
                temp = head;

                while(temp != tail){
                    if(temp.plate.equals(plate)){
                        calculateThePrice(temp,exit);
                        temp2.next = temp.next;
                        temp.next.prev = temp2;
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if(temp.plate.equals(plate)){
                    calculateThePrice(temp,exit);
                    tail = temp2;
                    tail.next = head;
                    head.prev = tail;
                    System.out.println("The car exit the otopark.");
                }
            }
        }
    }
    void calculateThePrice(OtoNode temp3, String exit2) throws ParseException {
        enter = temp3.enter;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        Date d1,d2;
        d1 = sdf.parse(enter);
        d2 = sdf.parse(exit2);

        minutes=d2.getTime() - d1.getTime();
        minutes=minutes/60000;
        price=minutes/4;
        System.out.println("Duration: " + minutes + " minutes");
        System.out.println("Price: " + price + "Tl");
        totalPrice += price;
    }

    void print(){
        if(head == null){
            System.out.println("There is nothing to delete");
        }
        else{
            System.out.println("Plate \t\t Check Time");
            temp = head;
            while(temp != tail){
                System.out.println(temp.plate + "\t\t" + temp.enter);
                temp = temp.next;
            }
            System.out.println(temp.plate + "\t\t" + temp.enter + "\n");
        }
    }


}
