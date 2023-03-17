import java.util.Scanner;

public class ArrayBeraksi {
    public static void main(String[] args) {
        int jmlData;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan Jumlah Data: ");
        jmlData = inp.nextInt();

        ArrayPrototype halo = new ArrayPrototype();

        halo.setArray(jmlData);

        halo.cetakArray();

        System.out.println("\nJumlah angka = " + halo.sumOfArray());
    }
    
}
