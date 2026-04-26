package modul8;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("[%d] ", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) {
            return;
        }
        inTraverse(node.left);
        System.out.printf("[%d] ", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) {
            return;
        }
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%d] ", node.data);
    }

    // Method untuk menghitung jumlah node di dalam binary tree
    public int countNode() {
        return countNodeHelper(root);
    }

    private int countNodeHelper(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodeHelper(node.left) + countNodeHelper(node.right);
    }

    // Method untuk menghitung jumlah daun
    public int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }

    // Method untuk mengukur tinggi binary tree
    public int height(Node node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    // Method untuk level order
    public void levelTraverse(Node node) {
        if (node == null) return;

        // Queue untuk menyimpan node yang akan diproses
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // ambil node terdepan
            System.out.printf("[%d] ", current.data);

            if (current.left != null) {
                queue.add(current.left); // tambahkan anak kiri ke queue
            }
            if (current.right != null) {
                queue.add(current.right); // tambahkan anak kanan ke queue
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        /*
        * HARDCODE SEMENTARA UNTUK PENGERJAAN, KARENA ANGKA SELALU RANDOM
        * MENGGUNAKAN DATA PERTAMA [6, 24, 8, 7, 17, 81, 98, 86, 32, 0]
         */

        // temp
        int[] nilai = {6, 24, 8, 7, 17, 81, 98, 86, 32, 0};

        // for (int i = 0; i < 10; i++) {
        //     int nilai = (int) (Math.random() * 100);
        //     System.out.printf("Nilai %d dimasukkan.\n", nilai);
        //     tree.add(nilai);
        // }
        // temp
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Nilai %d dimasukkan.\n", nilai[i]);
            tree.add(nilai[i]);
        }
        System.out.println();

        System.out.println("Preorder Traversal:");
        tree.preTraverse(tree.root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        tree.inTraverse(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postTraverse(tree.root);
        System.out.println();

        System.out.println("\nJumlah Node di dalam Binary Tree: " + tree.countNode());
        System.out.println();

        System.out.println("Jumlah Daun di dalam Binary Tree: " + tree.countLeaf(tree.root));
        System.out.println();

        System.out.println("Tinggi Binary Tree: " + tree.height(tree.root));
        System.out.println();

        System.out.println("Level Order Traversal:");
        tree.levelTraverse(tree.root);
    }
}
