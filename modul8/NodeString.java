package modul8;

public class NodeString {
    String data; // UBAH: int menjadi String
    NodeString left, right;

    public NodeString(String data) {
        this.data = data;
    }

    public void add(String data) {
        // UBAH: operator > dan < menjadi .compareTo()
        if (data.compareTo(this.data) > 0) {
            if (this.right == null) {
                this.right = new NodeString(data);
            } else this.right.add(data);
        }
        if (data.compareTo(this.data) < 0) {
            if (this.left == null) {
                this.left = new NodeString(data);
            } else this.left.add(data);
        }
    }
}
