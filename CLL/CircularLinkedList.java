package CLL;

public class CircularLinkedList extends Node {
    
    private Node head;
    protected int length;

    public CircularLinkedList() {
        this.head = new Node();
        this.length = 0;
    }

    public void printList() {
        System.out.println();
        if(length==0) {
            System.out.println("The Singly Linked List is currently empty.");
            System.out.print("HEAD -> NULL");
        } else {
            Node temp = head.getNext();
            System.out.print("HEAD -> ");
            for (int i=0; i<length; i++) {
                if (i<length-1) {
                    System.out.print(temp.getData() + " -> ");
                    temp = temp.getNext();
                } else {
                    System.out.print(temp.getData() + " -> NULL");
                }
            }
        }
        System.out.println();
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head.getNext());
        head.setNext(node);
        this.length++;
        printList();
    }

    public void insertLast(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head.getNext());
        Node temp = head;
        for(int i=0; i<length; i++) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        this.length++;
        printList();
    }

    public void insertAt(int data, int position) {
        if(position == 1) {
            insertFirst(data);
        } else if(position == length+1) {
            insertLast(data);
        } else if(position>1 && position<=length) {
            Node node = new Node();
            node.setData(data);
            Node temp = head;
            for(int i=0; i<position-1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            this.length++;
            printList();

        } else {
            System.out.println("Invalid Position");
            printList();
        }
    }

    public void deleteFirst() {
        if(length == 0) {
            printList();
        } else if(length == 1) {
            Node temp = head.getNext();
            head.setNext(null);
            temp = null;
            length--;
            printList();
        } else {
            Node temp = head.getNext();
            head.setNext(temp.getNext());
            temp = null;
            length--;
            printList();
        }
    }

    public void deleteLast() {
        if(length == 0) {
            printList();
        } else if(length == 1) {
            Node temp = head.getNext();
            head.setNext(null);
            temp = null;
            length--;
            printList();
        } else {
            Node temp = head;
            for(int i=0; i<length-1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(head.getNext());
            length--;
            printList();
        }
    }

    public void deleteAt(int position) {
        if(position == 1) {
            deleteFirst();
        } else if(position == length) {
            deleteLast();
        } else if(position>1 && position<length) {
            Node temp = head;
            for(int i=0; i<position-1; i++) {
                temp = temp.getNext();
            }
            Node prev = temp;
            temp = temp.getNext();
            Node next = temp.getNext();
            prev.setNext(next);
            temp = null;
            length--;
            printList();
        } else {
            System.out.println("Invalid Position");
            printList();
        }
    }

}
