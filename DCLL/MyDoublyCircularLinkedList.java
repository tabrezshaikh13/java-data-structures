package DCLL;

import java.util.Scanner;

public class MyDoublyCircularLinkedList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();

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
                dcll.insertFirst(data);
                break;
                case 2:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                dcll.insertLast(data);
                break;
                case 3:
                System.out.print("Enter the number: ");
                data = scan.nextInt();
                System.out.print("Enter the position: ");
                position = scan.nextInt();
                dcll.insertAt(data, position);
                break;
                case 4:
                dcll.deleteFirst();
                break;
                case 5:
                dcll.deleteLast();
                break;
                case 6:
                if(dcll.length != 0) {
                    System.out.print("Enter the position: ");
                    position = scan.nextInt();
                    dcll.deleteAt(position);
                } else {
                    dcll.printList();
                }
                break;
                case 7:
                flag = false;
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }

        scan.close();

    }
    
}