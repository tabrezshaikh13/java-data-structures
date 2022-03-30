package SLL;

public class SinglyLinkedList extends Node {

    private Node head;
    private int length;

    public SinglyLinkedList() {
        this.head = new Node();
        this.length = 0;
    }

    public void printList() {
        System.out.println();
        if(length == 0) {
            System.out.println("The Singly Linked List is currently empty.");
            System.out.print("HEAD -> NULL");
        } else {
            Node t = head.getNext();
            System.out.print("HEAD -> ");
            for (int i=0; i<length; i++) {
                if (i<length-1) {
                    System.out.print(t.getData() + " -> ");
                    t = t.getNext();
                } else {
                    System.out.print(t.getData() + " -> NULL");
                }
            }
        }
        System.out.println();
    }

    public void insertFirst(int data) {
        Node t = head.getNext();
        Node node = new Node();
        node.setData(data);
        node.setNext(t);
        head.setNext(node);
        length++;
        printList();
    }

    public void insertLast(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        Node t = head;
        while(t.getNext() != null) {
            t = t.getNext();
        }
        t.setNext(node);
        length++;
        printList();
    }

    public void insertAt(int data, int position) {
        if(position == 1) {
            insertFirst(data);
        } else if(position == length+1) {
            insertLast(data);
        } else if(position>1 && position<=length) {
            Node t = head;
            Node node = new Node();
            for(int i=0; i<position-1; i++) {
                t = t.getNext();
            }
            node.setData(data);
            node.setNext(t.getNext());
            t.setNext(node);
            length++;
            printList();
        } else {
            System.out.println("Invalid Position");
            printList();
        }
    }

    public void deleteFirst() {
        if(length == 0) {
            printList();
        } else {
            head.setNext(head.getNext().getNext());
            length--;
            printList();
        }
    }

    public void deleteLast() {
        if(length == 0) {
            printList();
        } else {
            Node t = head;
            for(int i=0; i<length; i++) {
                t = t.getNext();
            }
            t.setNext(null);
            length--;
            printList();
        }
    }

    public void deleteAt(int position) {
        if(length==0) {
            printList();
        } else if(position == 1) {
            deleteFirst();
        } else if(position == length) {
            deleteLast();
        } else if(position>1 && position<length) {
            Node t = head;
            for(int i=0; i<position; i++) {
                t = t.getNext();
            }
            t.setNext(t.getNext().getNext());
            length--;
            printList();
        } else {
            System.out.println("Invalid Position");
        }
    }
    
}
