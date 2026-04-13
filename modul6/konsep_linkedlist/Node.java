package modul6.konsep_linkedlist;

public class Node {
    Object data;
    Node next;

    public static void main(String[] args) {
        
        Node node = new Node();
        node.data = "A";

        System.out.println("node     : " + node);
        System.out.println("data     : " + node.data);
        System.out.println("pointer  : " + node.next);
    }
}

