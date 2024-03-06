package exercise1;


import static exercise1.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {

        // creo le istanze (ovvero degli oggetti)  a partire dalla classe Rettangolo;

        Rettangolo rettangoloUno = new Rettangolo(10, 20);
        Rettangolo rettangoloDue = new Rettangolo(13, 22);


        rettangoloUno.stampaRettangolo();
        rettangoloDue.stampaRettangolo();


        stampaDueRettangoli(rettangoloUno, rettangoloDue);


    }
}
