package modul7.stack;

public class CustomStack {
    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }



    public static void main(String[] args) {

        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);
        custom.push(4);

        // Stack sementara untuk menampung elemen yang di pop
        CustomStack tempStack = new CustomStack();
        // 1. Pop semua elemen kecuali paling bawah
        // custom.size - 1 berarti sisakan 1 elemen paling bawah
        int jumlahPop = custom.size - 1;
        for (int i = 0; i < jumlahPop; i++) {
            tempStack.push(custom.pop());
        }
        // 2. Masukkan nilai 5
        custom.push(5);
        // 3. Push balik semua elemen dari temp ke custom
        while (!tempStack.isEmpty()) {
            custom.push(tempStack.pop());
        }

        // System.out.println("Top element: " + custom.peek());

        System.out.print("Custom Stack: ");
        while (!custom.isEmpty()) {
            System.out.print("[" + custom.pop() + "] ");
        }
        System.out.println("End.");

        // System.out.println(custom.pop());
    }
}
