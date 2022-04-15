package Obst_Gemüse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bestellung_Zahlung {
    Scanner scan =new Scanner(System.in);
    //List<Obst_Gemüse> einkaufsWagen =new ArrayList<>();
    ObstundGemüse tomaten =new ObstundGemüse(00,"Tomaten",2.1);
    ObstundGemüse kartofeln =new ObstundGemüse(01,"Kartofeln",3.2);
    ObstundGemüse paprika =new ObstundGemüse(02,"Paprika",1.5);
    ObstundGemüse zwiebel =new ObstundGemüse(03,"Zwiebel",2.3);
    ObstundGemüse möre =new ObstundGemüse(04,"Möre",3.1);
    ObstundGemüse apfel =new ObstundGemüse(05,"Apfel",1.2);
    ObstundGemüse banana =new ObstundGemüse(06,"Banana",1.9);
    ObstundGemüse erdbeern =new ObstundGemüse(07,"Erdbeern",6.1);
    ObstundGemüse melon =new ObstundGemüse(8,"Melon",4.3);
    ObstundGemüse trauben =new ObstundGemüse(9,"Trauben",2.7);
    //Obst_Gemüse produkt =new Obst_Gemüse(9,"Trauben",2.7);
    ObstundGemüse ztrone =new ObstundGemüse(10,"Ztrone",0.5);
    //Obst_Gemüse produkt =new Obst_Gemüse(10,"Ztrone",0.5);

    List<ObstundGemüse> produkte =new ArrayList<>(Arrays.asList(tomaten,kartofeln,paprika,zwiebel,möre,apfel,banana,erdbeern,
            melon,trauben,ztrone));
    List<ObstundGemüse>produkt =new ArrayList<>();
    //int bestellungNo;
    double insgesamt;
    boolean erledigt =false;
    int enscheidung =1;
    //double betrag =insgesamt;

    public  double bestellung(){//siparis alip sepete ekleme
        List<ObstundGemüse>einkaufsWagen =new ArrayList<>();//sepet icin bos bir list
        while (!erledigt) {
            System.out.println("geben Sie bitte Produktno Ihrer WunschProdukt ein\nfür Tomaten: 0 /// Kartoffel: 1 /// Paprika: 2\n" +
                    "Zwiebel: 3 /// Möre: 4 /// Äpfel: 5 /// Banana 6\nErdbeern 7 /// Melone: 8 /// Trauben: 9 /// Ztrone 10");
            int bestellungNo = scan.nextInt();//ürün nosuna göre sparis alma
            //String produkt = produkte.get(bestellungNo).name;
            System.out.println("wie viel würden Sie kaufen");
            double produktMange = scan.nextDouble();//nekadar ürün almak isteniyor
            double gesamt = produktMange * produkte.get(bestellungNo).preis;//alina ürünün toplam ücreti
            ObstundGemüse produktGesamt = new ObstundGemüse(produkte.get(bestellungNo).name,produktMange, gesamt);//siparis edilen ürün obje olarak olusturulup
            insgesamt += gesamt;
            einkaufsWagen.add(produktGesamt);//listeye eklendi

            System.out.println("zum Beenden: 2\nZum weitermachen: 1");
            enscheidung = scan.nextInt();
            if(enscheidung==2){
                System.out.println("Sie haben volgende sachen gekauft : "+ produkte.get(bestellungNo).name);
                System.out.println("Ihre Totalbetrag: "+ insgesamt+"Euro");
                erledigt =true;
            }
            System.out.println(einkaufsWagen);
        }
        return insgesamt;
    }


    public  void zahlung(double insgesamt){
        System.out.println("zahlen Sie bitte "+insgesamt +"Euro ein");
        double zahlung =scan.nextDouble();
        while (!(zahlung>=insgesamt)){
            System.out.println("Sie sollten noch "+(insgesamt-zahlung)+"Euro einzahlen" );
            zahlung+=scan.nextDouble();
        }
        System.out.println("wir zahlen "+(zahlung-insgesamt)+"Euro zurück");
    }
}
