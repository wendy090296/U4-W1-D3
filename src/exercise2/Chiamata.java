package exercise2;

 public class Chiamata {
    // ATTRIBUTI

    private int durata;
    private String numeroChiamato;

    // COSTRUTTORE

    public  Chiamata(int durata, String numeroChiamato){
        this.durata= durata;
        this.numeroChiamato= numeroChiamato;

    }

    //METODI
    public int getDurata(){
        return durata;
    }

    public String getNumeroChiamato(){
        return numeroChiamato;
    }
}
