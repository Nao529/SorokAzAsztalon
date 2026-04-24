package main;
/**
 *
 * @author Nao
 */
public class Program {
    public static void main(String[] args) {
        Asztal a1 = new Asztal();

        Sor s1 = new Sor(Szin.VILAGOS, 6.8, 0.5);
        Sor s2 = new Sor(Szin.VILAGOS, 4.3, 1.0);
        Sor s3 = new Sor(Szin.BARNA, 2.5, 0.3);

        a1.sorHozzaad(s1);
        a1.sorHozzaad(s2);
        a1.sorHozzaad(s3);

        System.out.println(a1.szovegesMegjelenites());
        System.out.println("Asztal vizuálisan:");
        System.out.println(a1.vizualisMegjelenites());
    }
}