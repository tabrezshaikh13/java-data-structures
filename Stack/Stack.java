package Stack;

public class Stack extends Node {

    private Node top;
    protected int length;

    public Stack() {
        this.top = new Node();
        this.length = 0;
    }

    public void printStack() {
        System.out.println();
        if(length == 0) {
            System.out.println("The stack is empty");
            System.out.println();
            System.out.println("|   |");
            System.out.println(" --- ");
        } else {
            Node temp = top.getNext();
            for (int i=0; i<length; i++) {
                System.out.println("| " + temp.getData() + " |");
                temp = temp.getNext();
            }
            System.out.println(" --- ");
        }
        System.out.println();
    }

    public void push(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(top.getNext());
        top.setNext(node);
        length++;
        printStack();
    }

    public void pop() {
        if(length == 0) {
            printStack();
        } else {
            Node temp = top.getNext();
            top.setNext(temp.getNext());
            temp = null;
            length--;
            printStack();
        }
    }
    
}
