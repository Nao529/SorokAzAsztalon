package main;

public class Asztal {
    private Sor[] sorok;
    private int darab;

    public Asztal() {
        sorok = new Sor[4];
        darab = 0;
    }

    public boolean sorHozzaad(Sor sor) {
        if (darab < 4) {
            sorok[darab++] = sor;
            return true;
        }
        return false;
    }

    public String szovegesMegjelenites() {
        if (darab == 0) return "Az asztalon jelenleg nincs sör";
        String eredmeny = "Az asztalon lévő sörök:\n";
        for (int i = 0; i < darab; i++) {
            eredmeny += (i + 1) + ". " + sorok[i] + "\n";
        }
        return eredmeny;
    }
    public String vizualisMegjelenites() {
        String felso = "|";
        String also = "|";

        for (int i = 0; i < 2; i++) {
            if (i < darab) {
                felso += "o";
            } else {
                felso += " ";
            }
            if (i == 0) felso += " ";
        }

        for (int i = 2; i < 4; i++) {
            if (i < darab) {
                also += "o";
            } else {
                also += " ";
            }
            if (i == 2) also += " ";
        }
        felso += "|";
        also += "|";

        return felso + "\n" + also;
    }
}