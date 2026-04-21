package modul7.queue;

public class CustomQueue {
    
    private Node head, tail;
    private int size = 0;

    public void enqueue(int x) {
        Node n = new Node(x);
        if (tail != null) tail.next = n;
        tail = n;
        if (head == null) head = n;
        size++;
    }

    public int dequeue() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Custom Queue: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int peek() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        return head.data;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);

        queue.dequeue();
        queue.enqueue(35);
        queue.enqueue(45);

        // System.out.print("Custom Queue: ");
        // while (!queue.isEmpty()) {
        //     System.out.print(queue.dequeue() + " ");
        // }
        // System.out.println();

        queue.print();

        System.out.println();

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
    }
}
