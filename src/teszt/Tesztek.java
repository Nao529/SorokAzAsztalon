package teszt;

import main.Asztal;
import main.Sor;
import main.Szin;

public class Tesztek {
    
    public static void futtat() {
        tesztSorLetrehozasra();
        tesztMennyisegModositas();
        tesztNegativMennyiseg();

        tesztVizualisMegjelenites3Sor();
        tesztSzovegesMegjelenites();

        System.out.println("Tesztek lefutottak");
    }
    public static void haHiba(boolean feltetel, String uzenet) {
        if (feltetel) {
            System.out.println(uzenet);
        }
    }
    
    // sör tesztek
    public static void tesztSorLetrehozasra() {
        Sor sor = new Sor(Szin.VILAGOS, 5.0, 0.5);
        haHiba(sor.getSzin() != Szin.VILAGOS, "HIBA! Szín nem megfelelő");
        haHiba(sor.getAlkoholFok() != 5.0, "HIBA! Alkohol fok nem megfelelő");
        haHiba(sor.getMennyiseg() != 0.5, "HIBA! Mennyiség nem megfelelő");
    }
    public static void tesztMennyisegModositas() {
        Sor sor = new Sor(Szin.VILAGOS, 5.0, 0.5);
        sor.setMennyiseg(0.2);
        haHiba(sor.getMennyiseg() != 0.2, "HIBA! Mennyiség nem módositható");
    }
    public static void tesztNegativMennyiseg() {
        Sor sor = new Sor(Szin.VILAGOS, 5.0, 0.5);
        sor.setMennyiseg(-1);
        haHiba(sor.getMennyiseg() != 0.5, "HIBA! Nem lehet negatív érték");
    }

    // asztal tesztek
    public static void tesztVizualisMegjelenites3Sor() {
        Asztal a = new Asztal();
        a.sorHozzaad(new Sor(Szin.VILAGOS, 5.0, 0.5));
        a.sorHozzaad(new Sor(Szin.BARNA, 4.5, 0.5));
        a.sorHozzaad(new Sor(Szin.VILAGOS, 4.0, 0.33));
        String vart = "|o o|\n|o  |";
        haHiba(!a.vizualisMegjelenites().equals(vart), "HIBA! Megjelenítése hibás");
    }
    public static void tesztSzovegesMegjelenites() {
        Asztal a = new Asztal();
        a.sorHozzaad(new Sor(Szin.VILAGOS, 5.0, 0.5));
        String szoveg = a.szovegesMegjelenites();
        haHiba(!szoveg.contains("sör"), "HIBA! Szöveges megjelenítés hibás");
    }
}