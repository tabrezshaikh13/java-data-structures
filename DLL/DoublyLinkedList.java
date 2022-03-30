package DLL;


public class DoublyLinkedList extends Node {

    private Node head;
    protected int length;

    public DoublyLinkedList() {
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
            for(int i=0; i<length; i++) {
                if(i<length -1) {
                    System.out.print(t.getData() + " -> ");
                    t = t.getNext();
                } else {
                    System.out.println(t.getData() + " -> NULL");
                }
            }
        }
        System.out.println();
    }

    public void insertFirst(int data) {
        Node n = new Node();
        n.setData(data);
        n.setNext(head.getNext());
        n.setPrev(head);
        head.setNext(n);
        length++;
        printList();
    }

    public void insertLast(int data) {
        Node t = head;
        Node n = new Node();
        n.setData(data);
        while(t.getNext() != null) {
            t = t.getNext();
        }
        t.setNext(n);
        n.setPrev(t);
        n.setNext(null);
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
            node.setPrev(t);
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
        } else if(length == 1) {
            Node t = head.getNext();
            t = null;
            length--;
            printList();
        } else {
            Node t1 = head;
            Node t2 = t1.getNext();
            Node t3 = t2.getNext();
            t1.setNext(t3);
            t3.setPrev(t1);
            t2 = null;
            length--;
            printList();
        }
    }

    public void deleteLast() {
        if(length == 0) {
            printList();
        } else if(length == 1) {
            Node t = head.getNext();
            t = null;
            length--;
            printList();
        } else {
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp = temp.getPrev();
            temp.setNext(null);
            length--;
            printList();
        }
    }

    public void deleteAt(int position) {
        if(length == 0) {
            printList();
        } else if(position == 1) {
            deleteFirst();
        } else if(position == length) {
            deleteLast();
        } else if(position>1 && position<length) {
            Node toBeDeleted = head;
            for(int i=0; i<position; i++) {
                toBeDeleted = toBeDeleted.getNext();
            }
            Node prevNode = toBeDeleted.getPrev();
            Node nextNode = toBeDeleted.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
            toBeDeleted = null;
            length--;
            printList();
        } else {
            System.out.println("Invalid Position");
        }
    }
    
}
