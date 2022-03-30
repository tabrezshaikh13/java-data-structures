package Queue;

import java.util.Scanner;

public class MyQueue {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Queue q = new Queue();

        int data,choice;
        boolean flag = true;

        while(flag == true) {
            System.out.println();
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                System.out.print("Enter the data: ");
                data = scan.nextInt();
                q.enqueue(data);
                break;
                case 2:
                q.dequeue();
                break;
                case 3:
                q.printQueue();
                break;
                case 4:
                flag = false;
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }

        scan.close();

    }

}
