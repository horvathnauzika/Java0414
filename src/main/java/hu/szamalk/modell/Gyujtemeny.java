package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Gyujtemeny {
    private List<Mukincs> mukincsek;

    public Gyujtemeny() throws NemLetezoSzazadKivetel {
        mukincsek = new ArrayList<>();
        mukincsek.add(new Szobor(UUID.randomUUID(), "Alkotó1", "Cím1", Kategoria.EREDETI, "Anyag1", 19));
        mukincsek.add(new Szobor(UUID.randomUUID(), "Alkotó3", "Cím3", Kategoria.KIS_ERTEKU, "Anyag3", 18));
        mukincsek.add(new Festmeny(UUID.randomUUID(), "Alkotó2", "Cím2", Kategoria.MASOLAT, "Stílus1"));
    }
}
