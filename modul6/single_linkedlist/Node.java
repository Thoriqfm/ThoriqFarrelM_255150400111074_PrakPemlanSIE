package modul6.single_linkedlist;

public class Node {

    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }



    // public static void main(String[] args) {

    //     Node node = new Node("A");
    //     node.data = "A";

    //     System.out.println("node     : " + node);
    //     System.out.println("data     : " + node.data);
    //     System.out.println("pointer  : " + node.next);
    // }
}
