package modul6.single_linkedlist;

public class SingleLinkedList {

    Node head, tail;
    int size;

    void init() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
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
            tail = data;
        }
        size++;
    }

    // Method untuk mencari node dengan nilai tertentu
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
        return null; // Index tidak valid
    }

    Node removeNodeByPosition(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node removed;

        if (index == 0) {
            // Hapus head
            removed = head;
            head = head.next;
            // Jka list jadi kosong, tail juga null
            if (isEmpty()) {
                tail = null;
            }
        } else {
            // hapus node ditengah atau akhir
            Node prev = findPosition(index -1);
            removed = prev.next;
            prev.next = removed.next;
            // Jika hapus tail, update tail
            if (index == size - 1) {
                tail = prev;
            }
        }
        size--;
        return removed;
    }

    Node removeByValue (Object value) {
        if (isEmpty()) {
            return null;
        }

        Node removed = null;
        if (head.data.equals(value)) {
            removed = head;
            head = head.next; // Ke node berikutnya
            if (isEmpty()) { // Jika list jadi kosong, tail juga null
                tail = null;
            }
        } else {
            Node prev = head;
            while (prev.next != null) {
                if (prev.next.data.equals(value)) {
                    removed = prev.next;
                    prev.next = removed.next; // Lewati node yang dihapus
                    if (removed == tail) {
                        tail = prev; // Update tail jika yang dihapus adalah tail
                    }
                    size--;
                    break; // Hentikan loop setelah menemukan dan menghapus node
                }
                prev = prev.next; // Lanjut ke node berikutnya
            }
        }
        return removed;
    }

    Node addNodeByIndex(int index, Node data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) {
            addFirst(data);
            return data;
        } else if (index == size) {
            addLast(data);
            return data;
        } else {
            Node prev = findPosition(index - 1);
            data.next = prev.next;
            prev.next = data;
            size++;
            return data;
        }
    }

    Node addNodeAfterValue(Object value, Node data) {
        if (isEmpty()) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                data.next = temp.next;
                temp.next = data;
                if (temp == tail) {
                    tail = data; // Update tail jika ditambahkan setelah tail
                }
                size++;
                return data; // Node berhasil ditambahkan
            }
            temp = temp.next; // Lanjut ke node berikutnya
        }
        return null; // Node dengan nilai tertentu tidak ditemukan
    }

    Node addNodeBeforeValue(Object value, Node data) {
        if (isEmpty()) {
            return null;
        }

        if (head.data.equals(value)) {
            addFirst(data);
            return data;
        }

        Node prev = head;
        while (prev.next != null) {
            if (prev.next.data.equals(value)) {
                data.next = prev.next;
                prev.next = data;
                size++;
                return data; // Node berhasil ditambahkan
            }
            prev = prev.next; // Lanjut ke node berikutnya
        }
        return null; // Node dengan nilai tertentu tidak ditemukan
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        System.out.println("Head: " + list.head);
        System.out.println("tail: " + list.tail);

        list.addFirst(new Node("A"));
        System.out.println("Head: " + list.head);
        System.out.println("tail: " + list.tail);

        list.addFirst(new Node("B"));
        System.out.println("Head: " + list.head);
        System.out.println("tail: " + list.tail);

        list.addLast(new Node("C"));
        System.out.println("Head: " + list.head);
        System.out.println("tail: " + list.tail);

        System.out.println();

        // Cari node dengan data "A" dan data "D"
        Node found = list.find("A");
        if (found != null) {
            System.out.println("Ditemukan " + found);
        } else {
            System.out.println("Tidak ditemukan");
        }

        Node found2 = list.find("D");
        if (found2 != null) {
            System.out.println("Ditemukan " + found2);
        } else {
            System.out.println("Tidak ditemukan");
        }

        System.out.println();

        // Cari posisi node
        Node cariNode = list.findPosition(1);
        if (cariNode != null) {
            System.out.println("Ditemukan " + cariNode);
        } else {
            System.out.println("Tidak ditemukan");
        }

        System.out.println();

        // Hapus node pada posisi 1
        // Node removed = list.removeNodeByPosition(1);
        // if (removed != null) {
        //     System.out.println("Dihapus " + removed);
        // } else {
        //     System.out.println("Tidak ditemukan");
        // }

        // System.out.println("Head: " + list.head);
        // System.out.println("tail: " + list.tail);

        // System.out.println();

        // // Hapus node dengan nilai "C"
        // Node removedByValue = list.removeByValue("C");
        // if (removedByValue != null) {
        //     System.out.println("Dihapus " + removedByValue);
        // } else {
        //     System.out.println("Tidak ditemukan");
        // }

        // System.out.println("Head: " + list.head);
        // System.out.println("tail: " + list.tail);

        System.out.println();

        // Tambah node nilai "X" pada posisi 2
        Node addedByIndex = list.addNodeByIndex(2, new Node("X"));
        System.out.println("Ditambahkan " + addedByIndex);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Node " + i + ": " + list.findPosition(i));
        }

        System.out.println();

        // Tambah node nilai "Y" setelah node dengan nilai "B"
        Node addedAfterValue = list.addNodeAfterValue("B", new Node("Y"));
        if (addedAfterValue != null) {
            System.out.println("Ditambahkan " + addedAfterValue);
        } else {
            System.out.println("Tidak ditemukan");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Node " + i + ": " + list.findPosition(i));
        }

        System.out.println();

        // Tambah node nilai "Z" sebelum node dengan nilai "C"
        Node addedBeforeValue = list.addNodeBeforeValue("C", new Node("Z"));
        if (addedBeforeValue != null) {
            System.out.println("Ditambahkan " + addedBeforeValue);
        } else {
            System.out.println("Tidak ditemukan");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Node " + i + ": " + list.findPosition(i));
        }
    }
}
