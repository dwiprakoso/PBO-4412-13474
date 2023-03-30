import java.util.Scanner;
public class Determinan2Demo {
    public static void main (String[] args) {
        String cek;
        Scanner inp = new Scanner(System.in);
        do {
            double a = 0, b = 0, c = 0;
            Scanner reader = new Scanner(System.in);
            System.out.print("Input Data a : ");
            a=reader.nextDouble();
            System.out.println("");
            System.out.print("Input Data b : ");
            b=reader.nextDouble();
            System.out.println("");
            System.out.print("Input Data c : ");
            c=reader.nextDouble();
            System.out.println("");
            Determinan2 s = new Determinan2(a,b,c);
            
            if (s.isValid()) {
                  System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" mempunyai akar "+s.getX1()+" atau "+s.getX2());
          }
          else if (s.isValid1()) {
                  System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" mempunyai akar kembar yaitu "+s.getX1()+" atau "+s.getX2());
          }
          else {
              System.out.println("Persamaan "+s.getA()+"x^2"+" + "+s.getB()+"x "+"+ "+s.getC()+" tidak mempunyai akar-akar rill/khayal (imajiner)");
          }
    
            System.out.print("Input data lagi ? [Y/T] : ");
            cek = inp.next();
        } while (cek.equalsIgnoreCase("Y"));
    }
    
}
