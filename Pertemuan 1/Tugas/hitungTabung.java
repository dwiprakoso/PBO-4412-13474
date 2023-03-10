public class hitungTabung {
    public static void main(String[] args){
        float diameter2 = 5, tinggi2 = 10;
        float phi = 3.14f;
        float volume = (phi * ((diameter2 / 2) * (diameter2 / 2)) * tinggi2);
        System.out.println("Hasil volume dari tabung dengan  diameter alas " + diameter2 + " dan tingi " + tinggi2
                + " adalah " + volume + "\n");
    }
}

