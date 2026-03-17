package static_nonstatic;

public class GeometriApp {
    public static void main(String[] args) {
        Lingkaran lingKecil = new Lingkaran(2.0f);
        Lingkaran lingBesar = new Lingkaran(11.0f);

        float lK = lingKecil.luas();
        float lB = lingBesar.luas();

        // r dikirim secara eksplisit sebagai argumen
        float kK = Lingkaran.keliling(lingKecil.r);
        float kB = Lingkaran.keliling(lingBesar.r);

        System.out.println("Luas lingkaran kecil: " + lK);
        System.out.println("Luas lingkaran besar: " + lB);
        System.out.println("Keliling lingkaran kecil: " + kK);
        System.out.println("Keliling lingkaran besar: " + kB);
    }
}