package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;
import hu.szamalk.modell.NemLetezoSzazadKivetel;

public class Konzol {
    public static void main(String[] args) {
        try {
            Gyujtemeny gy = new Gyujtemeny();
            gy.fajlbaIr();
            gy.konzolraIr();
        } catch (NemLetezoSzazadKivetel e) {
            throw new RuntimeException(e);
        }
    }
}
