public class KendaraanBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Kendaraan mobil = new Kendaraan();
        Kendaraan motor = new Kendaraan();
        Kendaraan sepeda = new Kendaraan();
        motor.warna = "Hitam";
        motor.merk = "Yamaha Mio";
        motor.roda = 2;
        motor.infoKendaraan(); //memanggil class dari file kendaraan
        mobil.warna = "Merah";
        mobil.merk = "Toyota Innova";
        mobil.roda = 4;
        mobil.infoKendaraan(); //memanggil class dari file kendaraan
        mobil.berjalan("Depan"); //memanggil class dari file kendaraan
        mobil.berhenti(); //memanggil class dari file kendaraan
        mobil.kecepatan = 20;
        System.out.println("Kecepatan awal "+ mobil.kecepatan);
        int kecepatan = mobil.kecepatanSekarang(10, "lambat");
        System.out.println("Kecepatan kendaraan adalah "+kecepatan);
        mobil.mundur();
        System.out.println("Kecepatan sekarang setelah mundur "+mobil.kecepatan);




    }
    
}
