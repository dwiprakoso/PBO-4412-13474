public class Kendaraan{
    //atribute
    int roda;
    String warna;
    int kecepatan;
    String merk;

    public void berjalan(String arah){
        System.out.println("bergerak ke " + arah);
    }

    public void berhenti(){
        kecepatan = 0;
        System.out.println("berhenti di kecepatan " + kecepatan);
    }

    public void infoKendaraan(){
        System.out.println("Kendaraan Beroda " + roda);
        System.out.println("Kendaraan Berwarna " + warna);
        System.out.println("Kendaraan Bermerk " + merk);
    }
    
    public int kecepatanSekarang(int speed, String tipe){
        int x = 0;
        if(tipe == "cepat"){
            x = kecepatan + speed;
        }
        else if(tipe == "lambat"){
            x = kecepatan - speed;
        }
        return x;
    }
    
    public void mundur(){
        int x = 5;
        kecepatan = kecepatan - x;
    }
}