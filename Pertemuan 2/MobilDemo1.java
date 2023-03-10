public class MobileDemo1 {
    public static void main{String args[]}{
        //Pembuat Object
        Mobil1 mobilku = new Mobil1();
        Mobil1 mobilmu = new Mobil1();

        //Memanggil Attribut dan memberi nilai
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2000;
        mobilmu.warna = "Putih";
        mobilmu.tahunProduksi = 2020;

        System.out.println("Mobilku warna = "+mobilku.warna);
        System.out.println("Mobilku tahun = "+mobilku.tahunProduksi);

        System.out.println("Mobilmu warna = "+mobilmu.warna);
        System.out.println("Mobilmu tahun = "+mobilmu.tahunProduksi);

    }
}