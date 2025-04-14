package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Szobor extends Mukincs implements Serializable {
    private String anyag;
    private int szazad;

    public Szobor(UUID id, String alkoto, String cim, Kategoria kategoria, String anyag, int szazad) throws NemLetezoSzazadKivetel {
        super(id, alkoto, cim, kategoria);
        this.anyag = anyag;
        setSzazad(szazad);
    }

    public String getAnyag() {
        return anyag;
    }

    public int getSzazad() {
        return szazad;
    }

    public void setSzazad(int szazad) throws NemLetezoSzazadKivetel {
        if(szazad > 21){
            throw new NemLetezoSzazadKivetel("A század nem lehet > 21!");
        }
        this.szazad=szazad;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Szobor{" +
                "anyag='" + anyag + '\'' +
                ", szazad=" + szazad +
                '}';
    }
}
