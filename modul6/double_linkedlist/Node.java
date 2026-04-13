package modul6.double_linkedlist;

public class Node {

    Object data;
    Node next, prev;

    Node() {
    }

    Node(Object data) {
        this.data = data;
    }

    public static void main(String[] args) {
        
        Node nodeA = new Node("A");

        System.out.println("Data: " + nodeA);
        System.out.println("data: " + nodeA.data);
        System.out.println("next: " + nodeA.next);
        System.out.println("prev: " + nodeA.prev);

        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        System.out.println("next data: " + nodeA.next.data);
        System.out.println("prev data: " + nodeA.prev.data);
    }
}
