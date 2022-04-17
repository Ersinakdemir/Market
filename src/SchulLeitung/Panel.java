package SchulLeitung;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.

        1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
        Kayıtlarda şu bilgiler olabilmelidir.

        Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
        Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

        2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
        Aşağıdaki gibi bir menü gösterilsin.

        ====================================
        ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
        ====================================
        1- ÖĞRENCİ İŞLEMLERİ
        2- ÖĞRETMEN İŞLEMLERİ
        Q- ÇIKIŞ

        3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

        ============= İŞLEMLER =============
        1-EKLEME
        2-ARAMA
        3-LİSTELEME
        4-SİLME
        5-ANA MENÜ
        Q-ÇIKIŞ

        SEÇİMİNİZ:

        4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
        ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
        Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.


        */
public class Panel {
    static ArrayList<Person>schulerList = new ArrayList<>();
    static ArrayList<Person>lehrerList = new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static String welchePerson;

    static public void eingangsPanel(){
        System.out.println("====================================\nSchuler und Lehrer Leitung Panel\n" +
                             "==================================\n" +
                "1 - Schulerleitung\n2 - Lehrerleitung\nQ - Verlassen");
        System.out.println("wählen Sie bitte Ihr Prozes aus");
        String auswänlen =scan.next().toUpperCase(Locale.ROOT);

        switch (auswänlen){
            case "1":
                welchePerson ="Schuler";
                weitereProzes();
                break;
            case "2":
                welchePerson ="Lehrer";
                weitereProzes();
                break;
            case "Q":
                verlassen();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                eingangsPanel();//recursive method call
                break;
        }

    }

    private static void verlassen() {
        System.out.println("Aufwiedersehen");
    }

    public static void weitereProzes(){
        System.out.println("wählen Sie bitte für "+welchePerson +" weitereprozes aus.\r\n"
        +"==========Prozese==========\r\n" +
                "1 - Einfügen\r\n" +
                "2 - Suche\r\n" +
                "3 - Ausdrucken\r\n" +
                "4 - Löschen\r\n" +
                "0 - hauptmenu\r\n");
        int wunschProzes = scan.nextInt();

        switch (wunschProzes){
            case 1:
                einfügen();
                weitereProzes();
                break;
            case 2:
                suche();
                weitereProzes();
                break;
            case 3:
                ausdruken();
                weitereProzes();
                break;
            case 4:
                Löschen();
                weitereProzes();
                break;
            case 0:
                eingangsPanel();
                break;
            default:
                System.out.println("geben sie bitte Ihr Wunschprozes ein");
                weitereProzes();
        }

    }

    private static void Löschen() {
        System.out.println("   ****   "+welchePerson+" Löschseite   ****");
        boolean flag =true;
        if (welchePerson.equalsIgnoreCase("schuler")){//ögrenci ariyorsa
            scan.nextLine();//dummy
            System.out.println("geben Sire bitte AusweissNo ein ");
            String loschAusweissN0 =scan.next();
            for (Person w:schulerList) {
                if (w.getAusweissNo().equalsIgnoreCase(loschAusweissN0)){
                    System.out.println("Sie haben  "+ w.getnameNachName()+" gelöscht");
                    schulerList.remove(w);//ögrenci silindi
                    flag=false;
                }
            }
            if (flag){
                System.out.println(loschAusweissN0 +" nicht verfüngbar" );
            }
        }
        else {//ögretmen ariyor
            scan.nextLine();//dummy hayalet komut
            System.out.println("geben Sire bitte AusweissNo ein ");
            String loschAusweissN0 = scan.next();
            for (Person w : lehrerList) {
                if (w.getAusweissNo().equalsIgnoreCase(loschAusweissN0)) {//flag havada
                    System.out.println("Sie haben " + w.getnameNachName() + " gelöscht");
                    lehrerList.remove(w);
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(loschAusweissN0 + " nicht verfüngbar");
            }
        }

    }

    private static void ausdruken() {
        System.out.println("   ****   "+welchePerson+" Ausdruckseite   ****");
        if (welchePerson.equalsIgnoreCase("Schuler")){//Ögrenci listele
            System.out.println(schulerList);
        }else{//ögretmen listeler
            System.out.println(lehrerList);
        }
    }

    private static void suche() {
        System.out.println("   ****   "+welchePerson+" Suchseite   ****");
        boolean flag =true;
        if (welchePerson.equalsIgnoreCase("schuler")){//ögrenci ariyorsa
            scan.nextLine();//dummy
            System.out.println("geben Sire bitte AusweissNo ein ");
            String suchAusweissN0 =scan.next();
            for (Person w:schulerList) {
                if (w.getAusweissNo().equalsIgnoreCase(suchAusweissN0)){
                    System.out.println("Sie suchen "+ w.getnameNachName()+"?");
                    System.out.println(w);
                    flag=false;
                }
            }
            if (flag){
                System.out.println(suchAusweissN0 +" nicht verfüngbar" );
            }
        }
        else {//ögretmen ariyor
            scan.nextLine();//dummy hayalet komut
            System.out.println("geben Sire bitte AusweissNo ein ");
            String suchAusweissN0 = scan.next();
            for (Person w : lehrerList) {
                if (w.getAusweissNo().equalsIgnoreCase(suchAusweissN0)) {//flag havada
                    System.out.println("Suchen Sie " + w.getnameNachName() + "?");
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(suchAusweissN0 + " nicht verfüngbar");
            }
        }
    }


    private static void einfügen() {
        System.out.println("   ****   "+welchePerson+" Einfügenseite   ****");
        System.out.println("geben Sie bitte Ihr Name und Nachname ein: ");
        scan.nextLine();//dummy hayalet komut

        String nameNachname =scan.nextLine();
        System.out.println("geben Sie bitte Ihr Ausweiss No ein: ");
        String AusweissNo = scan.nextLine();
        System.out.println("Geben Sie bitte Ihr Alter ein: ");
        int alter =scan.nextInt();
        if (welchePerson.equalsIgnoreCase("Schuler")){
            System.out.println("geben Sie bitte Ihr SchulNo ein: ");
            scan.nextLine();//dummy hayalet komut
            String schulNo =scan.nextLine();
            System.out.println("geben Sie bitte Ihr Klass ein: ");
            String klass = scan.nextLine();
            Schuler schuler =new Schuler(nameNachname,AusweissNo,alter,schulNo,klass);//paramegtreli Constructor
            schulerList.add(schuler);
        }else{
            System.out.println("geben Sie bitte Ihr pfach ein: ");
            scan.nextLine();//dummy hayalet komut
            String fach =scan.nextLine();
            System.out.println("geben Sie bitte Ihr personNo ein: ");
            String personNo = scan.nextLine();
            Lehrer lehrer = new Lehrer(nameNachname,AusweissNo,alter,fach,personNo);
            lehrerList.add(lehrer);
        }
    }
}
