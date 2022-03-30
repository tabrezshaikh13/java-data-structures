package CLL;

import java.util.Scanner;

public class MyCircularLinkedList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        boolean flag = true;
        int data,choice,position;

        while(flag == true) {
            System.out.println();
            System.out.println("*********MENU*********");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert At");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete At");
            System.out.println("7. Exit Menu");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                circularLinkedList.insertFirst(data);
                break;
                case 2:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                circularLinkedList.insertLast(data);
                break;
                case 3:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                System.out.print("Enter the position: ");
                position = scan.nextInt();
                circularLinkedList.insertAt(data, position);
                break;
                case 4:
                circularLinkedList.deleteFirst();
                break;
                case 5:
                circularLinkedList.deleteLast();
                break;
                case 6:
                if(circularLinkedList.length != 0) {
                    System.out.print("Enter the position: ");
                    position = scan.nextInt();
                    circularLinkedList.deleteAt(position);
                } else {
                    circularLinkedList.printList();
                }
                break;
                case 7:
                circularLinkedList.printList();
                flag = false;
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }

        scan.close();
    }
    
}
