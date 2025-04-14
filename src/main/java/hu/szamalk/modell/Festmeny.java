package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Festmeny extends Mukincs implements Serializable {
    private String stilus;

    public Festmeny(UUID id, String alkoto, String cim, Kategoria kategoria, String stilus) {
        super(id, alkoto, cim, kategoria);
        this.stilus = stilus;
    }

    public String getStilus() {
        return stilus;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Festmeny{" +
                "stilus='" + stilus + '\'' +
                '}';
    }
}
