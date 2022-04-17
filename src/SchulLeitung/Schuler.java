package SchulLeitung;
/*BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.

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
public class Schuler extends Person{
    private String schulNo;
    private String klass;

    public Schuler(){

    }

    public Schuler(String nameNachname, String ausweissNo, int alter, String schulNo, String klass) {
        super(nameNachname, ausweissNo, alter);
        this.schulNo = schulNo;
        this.klass = klass;
    }

    public String getSchulNo() {
        return schulNo;
    }

    public void setSchulNo(String schulNo) {
        this.schulNo = schulNo;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    @Override
    public String toString() {
        return "Schuler{" +
                "nameNachName='" + nameNachName + '\'' +
                ", AusweissNo='" + AusweissNo + '\'' +
                ", alter=" + alter +
                ", schulNo='" + schulNo + '\'' +
                ", klass='" + klass + '\'' +
                '}';
    }
}
