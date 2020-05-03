public class Mobil { //Class

    //Atribute
    String merek;
    String warna;
    int harga;
    int tahun;
    String nomesin;


    public Mobil(){//Object

    }


    //Behavior
    void maju() {
        System.out.println("Laju Mobil Berkecepatan 80Km/jam");
        System.out.println("Merek Mobil Adalah " + merek);
        System.out.println("Warna Mobil Adalah " + warna);
        System.out.println("Harga Mobil :" + harga);
        System.out.println("Tahun Pembuatan :" + tahun);
        System.out.println("Nomor Mesin :" + nomesin);
        System.out.println("Saya Alat Transportasi yang bisa DiPakai Kemana Saja");
        System.out.println();
    }

    void mundur() {
        System.out.println("Saya Bisa Mundur,, Keren Kan...");
        System.out.println("Ingat Lihat Kaca Spion..");
        System.out.println();
    }

    void belok() {
        System.out.println("Waww Saya Bisa Belok Kiri dan Belok Kanan");
        System.out.println("Super Canggih..");
        System.out.println();
    }

}
