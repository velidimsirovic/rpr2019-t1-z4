package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        assertAll("dodavanje",
                () -> assertTrue(k.dodajArtikl(a1)),
                () -> assertTrue(k.dodajArtikl(a2)),
                () -> assertEquals(2, k.getTrenutnoArtikala())
        );
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        k.dodajArtikl(a1);
        k.dodajArtikl(a2);
        assertEquals(a1.getKod(), k.izbaciArtiklSaKodom(a1.getKod()).getKod());
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        k.dodajArtikl(a1);
        k.dodajArtikl(a2);
        assertEquals(3500, k.dajUkupnuCijenuArtikala());
    }

    @org.junit.jupiter.api.Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        Artikl a3 = new Artikl("Tastatura", 250, "2");
        Artikl a4 = new Artikl("Lajsna", 200, "2");
        k.dodajArtikl(a1);
        k.dodajArtikl(a2);
        k.dodajArtikl(a3);
        k.dodajArtikl(a4);
        Artikl[] artikli = k.getArtikli();
        int ima_artikala = 0;
        for (int i = 0; i < 50; i++) if (artikli[i] != null) ima_artikala++;
        assertEquals(4, ima_artikala);
    }
}