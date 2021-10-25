package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        s.dodajArtikl(a1);
        s.dodajArtikl(a2);
        assertEquals(a1.getKod(), s.izbaciArtiklSaKodom(a1.getKod()).getKod());
    }

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        assertAll("dodavanje",
                () -> assertTrue(s.dodajArtikl(a1)),
                () -> assertTrue(s.dodajArtikl(a2)),
                () -> assertEquals(2, s.getTrenutnoArtikala())
        );
    }

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl a1 = new Artikl("Laptop", 2000, "1");
        Artikl a2 = new Artikl("Monitor", 1500, "2");
        Artikl a3 = new Artikl("Tastatura", 250, "2");
        Artikl a4 = new Artikl("Lajsna", 200, "2");
        s.dodajArtikl(a1);
        s.dodajArtikl(a2);
        s.dodajArtikl(a3);
        s.dodajArtikl(a4);
        Artikl[] artikli = s.getArtikli();
        int ima_artikala = 0;
        for (int i = 0; i < 50; i++) if (artikli[i] != null) ima_artikala++;
        assertEquals(4, ima_artikala);
    }
}