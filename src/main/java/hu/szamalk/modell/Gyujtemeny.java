package hu.szamalk.modell;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Gyujtemeny{
    private List<Mukincs> mukincsek;

    public Gyujtemeny() throws NemLetezoSzazadKivetel {
        mukincsek = new ArrayList<>();
        mukincsek.add(new Szobor(UUID.randomUUID(), "Alkotó1", "Cím1", Kategoria.EREDETI, "Anyag1", 19));
        mukincsek.add(new Szobor(UUID.randomUUID(), "Alkotó3", "Cím3", Kategoria.KIS_ERTEKU, "Anyag3", 18));
        mukincsek.add(new Festmeny(UUID.randomUUID(), "Alkotó2", "Cím2", Kategoria.MASOLAT, "Stílus1"));
    }

    public void konzolraIr(){
        System.out.println(mukincsek);
    }

    public void fajlbaIr(){
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("mutargyak.txt"));
            objKi.writeObject(mukincsek);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Mukincs> getMukincsek() {
        return new ArrayList<>(mukincsek);
    }

}
