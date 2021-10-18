package ba.unsa.etf.rpr;

public class Supermarket {
    private int trenutnoArtikala = 0;
    private Artikl[] artikli = new Artikl[1000];

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl izbacen = null;
        for (int i = 0; i < trenutnoArtikala; i++){
            if (artikli[i].getKod().equals(kod)){
                izbacen = artikli[i];
                for (int j = i; j < trenutnoArtikala - 1; j++) artikli[j] = artikli[j + 1];
                trenutnoArtikala = trenutnoArtikala - 1;
                artikli[trenutnoArtikala] = null;
            }
        }
        return izbacen;
    }

    public boolean dodajArtikl(Artikl artikl){
        if (trenutnoArtikala == 1000) return false;
        artikli[trenutnoArtikala] = artikl;
        trenutnoArtikala = trenutnoArtikala + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
