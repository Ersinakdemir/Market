package Obst_Gemüse;

public class Market_Main {
    public static void main(String[] args) {
        Bestellung_Zahlung bestellung =new Bestellung_Zahlung();
        Bestellung_Zahlung zahlung =new Bestellung_Zahlung();
        bestellung.bestellung();
        zahlung.zahlung(bestellung.insgesamt);


    }
}
