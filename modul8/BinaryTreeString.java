package modul8;

public class BinaryTreeString {

    NodeString root;

    public void add(String data) { // UBAH: int menjadi String
        if (root == null) {
            root = new NodeString(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(NodeString node) {
        if (node == null) {
            return;
        }
        System.out.printf("[%s] ", node.data); // UBAH: %d menjadi %s
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(NodeString node) {
        if (node == null) {
            return;
        }
        inTraverse(node.left);
        System.out.printf("[%s] ", node.data); // UBAH: %d menjadi %s
        inTraverse(node.right);
    }

    public void postTraverse(NodeString node) {
        if (node == null) {
            return;
        }
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%s] ", node.data); // UBAH: %d menjadi %s
    }

    public int countLeaf(NodeString node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }

    public int height(NodeString node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) {

        BinaryTreeString tree = new BinaryTreeString();

        // Demo dengan data String
        String[] fruits = {"Mangga", "Apel", "Semangka", "Jeruk",
            "Durian", "Pisang", "Anggur", "Melon",
            "Nanas", "Pepaya"};

        for (String fruit : fruits) {
            System.out.printf("Nilai %s dimasukkan.\n", fruit);
            tree.add(fruit);
        }

        System.out.println("\n--- Pre-Order Traversal ---");
        tree.preTraverse(tree.root);

        System.out.println("\n--- In-Order Traversal ---");
        tree.inTraverse(tree.root);

        System.out.println("\n--- Post-Order Traversal ---");
        tree.postTraverse(tree.root);

        System.out.println("\n--- Jumlah Daun ---");
        System.out.println("Banyaknya daun: " + tree.countLeaf(tree.root));

        System.out.println("\n--- Tinggi Tree ---");
        System.out.println("Tinggi tree: " + tree.height(tree.root));
    }
}
