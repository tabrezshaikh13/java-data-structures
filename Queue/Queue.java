package Queue;

public class Queue {
    
    private Node first;
    protected int length;

    public Queue() {
        this.first = new Node();
        this.length = 0;
    }

    public void printQueue() {
        System.out.println();
        if(length == 0) {
            System.out.println("The Queue is empty");
        } else {
            Node temp = first.getNext();
            for(int i=0; i<length; i++) {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
        System.out.println();
    }

    public void enqueue(int data) {
        Node node = new Node();
        node.setData(data);
        Node temp = first;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        length++;
        printQueue();
    }

    public void dequeue() {
        if(length == 0) {
            printQueue();
        } else {
            Node temp = first.getNext();
            first.setNext(temp.getNext());
            temp = null;
            length--;
            printQueue();
        }
    }

}
