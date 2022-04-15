package Obst_Gemüse;

import java.util.Scanner;

public class ObstundGemüse {
    int produktNo;
    String name;
    double preis;
    double sum;
    double produktMange;

    //List<Obst_Gemüse> produkte =new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public ObstundGemüse(int produktNo, String name, double preis) {
        this.produktNo = produktNo;
        this.name = name;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Obst_Gemüse{" +
                "name='" + name + '\'' +
                ", produktMange=" + produktMange +
                ", sum=" + sum +
                '}';
    }

    public ObstundGemüse(String name, double produktMange,double sum) {
        this.name = name;
        this.sum = sum;
        this.produktMange =produktMange;
    }
    /*public List<Obst_Gemüse> produktAdd(){


       return produkte;
    }*/

}
