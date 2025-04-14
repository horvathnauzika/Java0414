package hu.szamalk.modell;

import java.util.UUID;

public class Festmeny extends Mukincs{
    private String stilus;

    public Festmeny(UUID id, String alkoto, String cim, Kategoria kategoria, String stilus) {
        super(id, alkoto, cim, kategoria);
        this.stilus = stilus;
    }
}
