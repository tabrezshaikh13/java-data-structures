package DLL;

import java.util.Scanner;

public class MyDoublyLinkedList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

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
            System.out.println("7. Exit");

            System.out.print("Enter Your choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                doublyLinkedList.insertFirst(data);
                break;
                case 2:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                doublyLinkedList.insertLast(data);
                break;
                case 3:
                System.out.print("Enter the number: ");
                data  = scan.nextInt();
                System.out.print("Enter the position: ");
                position = scan.nextInt();
                doublyLinkedList.insertAt(data, position);
                break;
                case 4:
                doublyLinkedList.deleteFirst();
                break;
                case 5:
                doublyLinkedList.deleteLast();
                break;
                case 6:
                if(doublyLinkedList.length != 0) {
                    System.out.print("Enter the position: ");
                    position = scan.nextInt();
                    doublyLinkedList.deleteAt(position);
                } else {
                    doublyLinkedList.printList();
                }
                break;
                case 7:
                doublyLinkedList.printList();
                flag = false;
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }
        scan.close();
    }
    
}
