package main;

import java.util.Objects;

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
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.szin);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.alkoholFok) ^ (Double.doubleToLongBits(this.alkoholFok) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.mennyiseg) ^ (Double.doubleToLongBits(this.mennyiseg) >>> 32));
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sor other = (Sor) obj;
        if (Double.doubleToLongBits(this.alkoholFok) != Double.doubleToLongBits(other.alkoholFok)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mennyiseg) != Double.doubleToLongBits(other.mennyiseg)) {
            return false;
        }
        return this.szin == other.szin;
    }
}