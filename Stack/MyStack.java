package Stack;

import java.util.Scanner;

public class MyStack {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();

        int data,choice;
        boolean flag = true;

        while(flag == true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                System.out.print("Enter the data: ");
                data = scan.nextInt();
                stack.push(data);
                break;
                case 2:
                stack.pop();
                break;
                case 3:
                stack.printStack();
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
