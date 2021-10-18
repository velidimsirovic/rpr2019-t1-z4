package ba.unsa.etf.rpr;

public class Korpa {
    private int trenutnoArtikala = 0;
    private Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl artikl){
        if (trenutnoArtikala == 50) return false;
        artikli[trenutnoArtikala] = artikl;
        trenutnoArtikala = trenutnoArtikala + 1;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbacen = null;
        for (int i = 0; i < trenutnoArtikala; i++){
            if (artikli[i].getKod().equals(kod)){
                izbacen = artikli[i];
                for (int j = i; j < trenutnoArtikala - 1; j++) artikli[j] = artikli[j + 1];
                trenutnoArtikala = trenutnoArtikala - 1;
            }
        }
        return izbacen;
    }

    public int dajUkupnuCijenuArtikala(){
        int ukupna = 0;
        for (int i = 0; i < trenutnoArtikala; i++) ukupna = ukupna + artikli[i].getCijena();
        return ukupna;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
