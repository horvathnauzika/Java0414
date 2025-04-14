package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Mukincs implements Serializable {
    private UUID id;
    private String alkoto, cim;
    private Kategoria kategoria;

    public Mukincs(UUID id, String alkoto, String cim, Kategoria kategoria) {
        this.id = id;
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
    }

    public UUID getId() {
        return id;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "id=" + id +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria=" + kategoria +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
