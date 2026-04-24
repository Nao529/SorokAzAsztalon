package main;

public class Sor {
    private final Szin szin;
    private double alkoholFok;
    private double mennyiseg;
    
    public Sor(Szin szin, double alkoholFok, double mennyiseg) {
        this.szin = szin;
        this.alkoholFok = alkoholFok;
        this.mennyiseg = mennyiseg;
    }

    public double getAlkoholFok() {
        return alkoholFok;
    }
    public double getMennyiseg() {
        return mennyiseg;
    }
    public Szin getSzin() {
        return szin;
    }

    public void setMennyiseg(double mennyiseg) {
        if (mennyiseg >= 0) {
            this.mennyiseg = mennyiseg;
        } else {
            System.out.println("Nem jó a mennyiség");
        }
    }

    @Override
    public String toString() {
        return szin + " sör, " + mennyiseg + " l, " + alkoholFok + "% alkohol";
    }
}