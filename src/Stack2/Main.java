package Stack2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the stack size?");
        int s = scanner.nextInt();
        Stack stack = new Stack(s);

        int choice = -1;

        while (choice != 0) {
            System.out.println("1- Push");
            System.out.println("2- Pop");
            System.out.println("3- Print of top value");
            System.out.println("4- Print ");
            System.out.println("0- Exit");
            System.out.println("Enter your choice");choice = scanner.nextInt();
            System.out.println("\n");


            switch (choice) {
                case 1:
                    System.out.println("Enter the value to push");
                    int value = scanner.nextInt();
                    stack.push(value);break;
                case 2:stack.pop();break;
                case 3: stack.printTop();break;
                case 4: stack.printStack();break;
                case 0: break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
