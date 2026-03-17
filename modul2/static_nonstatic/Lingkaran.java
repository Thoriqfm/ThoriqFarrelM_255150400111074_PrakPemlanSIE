package static_nonstatic;

public class Lingkaran {

    public static float PI = 3.14f;
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return Lingkaran.PI * r * r;
    }

    public static float keliling(float r) {
        return 2 * Lingkaran.PI * r;
    }

}
