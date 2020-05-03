public class Main {
    public static void main(String[] args) {
        Mobil objek = new Mobil();

        objek.merek = "Avanza";
        objek.warna = "Putih";
        objek.harga = 1500000;
        objek.tahun = 2009;
        objek.nomesin = "Bd919";

        objek.maju();
        objek.mundur();
        objek.belok();
    }
}
