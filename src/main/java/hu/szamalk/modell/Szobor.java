package hu.szamalk.modell;

import java.util.UUID;

public class Szobor extends Mukincs{
    private String anyag;
    private int szazad;

    public Szobor(UUID id, String alkoto, String cim, Kategoria kategoria, String anyag, int szazad) throws NemLetezoSzazadKivetel {
        super(id, alkoto, cim, kategoria);
        this.anyag = anyag;
        setSzazad(szazad);

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
}
