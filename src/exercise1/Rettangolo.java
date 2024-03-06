package exercise1;


public class Rettangolo {

    // ATTRIBUTI
    private int base;
    private int altezza;







    //  COSTRUTTORE

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;





    }


    // METODI

    public int perimetro(){ // creo metodo per calcolare perimetro
        return (base+altezza)*2;
    }

    public int area(){  // creo metodo per calcolare area
        return (base*altezza);
    }

    public void stampaRettangolo(){ // // creo metodo per stampare perimetro e area di 1 rettangolo
        int perimetro=perimetro();
        int area=area();
        System.out.println("Il perimetro é: " + perimetro);
        System.out.println("L'area é: " + area);

    }

    public static void stampaDueRettangoli(Rettangolo rettangoloUno, Rettangolo rettangoloDue){

        int perimetroTotale=rettangoloUno.perimetro() + rettangoloDue.perimetro();
        int areaTotale=rettangoloUno.area() + rettangoloDue.area();

        System.out.println("La somma dei perimetri dei rettangoli é:" + perimetroTotale);
        System.out.println("La somma delle aree é:" + areaTotale);

    }
}
