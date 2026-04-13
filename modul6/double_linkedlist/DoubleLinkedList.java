package modul6.double_linkedlist;

public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Method mengurutkan dari belakang ke depan
    void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    // Mencari node by value
    Node find(Object value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.equals(value)) {
                return temp; // Node ditemukan
            }
            temp = temp.next; // Lanjut ke node berikutnya
        }
        return null; // Node tidak ditemukan
    }

    // Mencari node by index
    Node findPosition(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            if (counter == index) {
                return temp; // Node ditemukan
            }
            temp = temp.next; // Lanjut ke node berikutnya
            counter++;
        }
        return null; // Node tidak ditemukan
    }

    // Delete node by index
    Node removeNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = findPosition(index);

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next; // Jika node yang dihapus adalah head
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev; // Jika node yang dihapus adalah tail
        }

        size--;
        return current; // Node yang dihapus
    }

    // Delete node by value
    Node removeNodeByValue(Object value) {
        if (isEmpty()) {
            return null; // List kosong
        }

        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Jika node yang dihapus adalah head
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // Jika node yang dihapus adalah tail
                }

                size--;
                return current; // Node yang dihapus
            }
            current = current.next; // Lanjut ke node berikutnya
        }
        return null; // Node dengan nilai tersebut tidak ditemukan
    }

    // Add node by index
    void addNodeByIndex(int index, Node data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node prev = findPosition(index - 1);
            data.next = prev.next;
            data.prev = prev;
            prev.next.prev = data;
            prev.next = data;
            size++;
        }
    }

    // Add node after node value
    void addNodeAfterValue(Object value, Node data) {
        if (isEmpty()) {
            return; // List kosong
        }

        Node current = find(value);
        if (current != null) {
            data.next = current.next;
            data.prev = current;
            current.next.prev = data;
            current.next = data;
            size++;
        }
    }

    // Add node before node value
    void addNodeBeforeValue(Object value, Node data) {
        if (isEmpty()) {
            return; // List kosong
        }

        Node current = find(value);
        if (current != null) {
            data.next = current;
            data.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = data;
            } else {
                head = data; // Jika node yang ditambahkan menjadi head
            }
            current.prev = data;
            size++;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        list.addLast(nodeA);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeB);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.addLast(nodeC);
        System.out.println("head: " + list.head.data);
        System.out.println("tail: " + list.tail.data);

        list.print();

        System.out.println();

        System.out.println("Next of B: " + nodeB.next.data);
        System.out.println("Previous of B: " + nodeB.prev.data);

        System.out.println();
        list.printReverse();

        System.out.println();

        // Mencari node dengan nilai "B"
        Node foundNode = list.find("B");
        if (foundNode != null) {
            System.out.println("Node ditemukan: " + foundNode.data);
        } else {
            System.out.println("Node tidak ditemukan.");
        }

        System.out.println();

        // Mencari node pada posisi index 1
        Node foundPositionNode = list.findPosition(1);
        if (foundPositionNode != null) {
            System.out.println("Node pada posisi index 1: " + foundPositionNode.data);
        } else {
            System.out.println("Node pada posisi index 1 tidak ditemukan.");
        }

        System.out.println();

        // Menghapus node pada posisi index 1
        // Node removedNode = list.removeNodeByIndex(1);
        // if (removedNode != null) {
        //     System.out.println("Node yang dihapus: " + removedNode.data);
        // } else {
        //     System.out.println("Node pada posisi index 1 tidak ditemukan untuk dihapus.");
        // }
        // list.print();

        System.out.println();

        // Menghapus node dengan nilai "C"
        Node removedByValueNode = list.removeNodeByValue("C");
        if (removedByValueNode != null) {
            System.out.println("Node yang dihapus: " + removedByValueNode.data);
        } else {
            System.out.println("Node dengan nilai 'C' tidak ditemukan untuk dihapus.");
        }
        list.print();

        System.out.println();

        // Menambahkan node dengan nilai "D" pada posisi index 1
        Node newNode = new Node("D");
        list.addNodeByIndex(1, newNode);
        list.print();

        System.out.println();

        // Menambahkan node dengan nilai "E" setelah node dengan nilai "A"
        Node newNodeE = new Node("E");
        list.addNodeAfterValue("A", newNodeE);
        list.print();

        System.out.println();

        // Menambahkan node dengan nilai "F" sebelum node dengan nilai "D"
        Node newNodeF = new Node("F");
        list.addNodeBeforeValue("D", newNodeF);
        list.print();

    }
}
