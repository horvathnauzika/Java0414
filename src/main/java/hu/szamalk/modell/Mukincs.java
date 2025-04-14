package hu.szamalk.modell;

import java.util.UUID;

public class Mukincs {
    private UUID id;
    private String alkoto, cim;
    private Kategoria kategoria;

    public Mukincs(UUID id, String alkoto, String cim, Kategoria kategoria) {
        this.id = id;
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
    }
}
