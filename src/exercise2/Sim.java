package exercise2;

public class Sim {
    // ATTRIBUTI
  private  long numeroDiTelefono;
   private int creditoDisponibile;
   public  Chiamata[] ultimeChiamate;



   // COSTRUTTORE
    public Sim(long numeroDiTelefono) {

        this.numeroDiTelefono= numeroDiTelefono;
        this.creditoDisponibile= 0;
        this.ultimeChiamate= new Chiamata[0]; // lista chiamate vuota



    }

    // METODI
    public void stampaDatiSim(){
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito disponibile: " +"€" +  creditoDisponibile);
        System.out.println("Ultime chiamate: " + java.util.Arrays.toString(ultimeChiamate));
    }



}

