package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;
    Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    Artikl(Artikl a){
        this.naziv = a.naziv;
        this.cijena = a.cijena;
        this.kod = a.kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }
}
