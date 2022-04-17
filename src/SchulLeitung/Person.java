package SchulLeitung;

import java.util.Locale;

public class Person {
    String nameNachName;
    String AusweissNo;
    int alter;


    public Person(){

    }

    public Person(String nameNachname, String ausweissNo, int alter) {
        setnameNachName(nameNachname);
        AusweissNo = ausweissNo;
        setAlter(alter);
    }

    public String getnameNachName() {
        return nameNachName;
    }

    public void setnameNachName(String nameNachname) {
        this.nameNachName = nameNachname;
    }



    public String getAusweissNo() {
        return AusweissNo;
    }

    public void setAusweissNo(String ausweissNo) {
        AusweissNo = ausweissNo;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if(alter<0){
            this.alter=-alter;
        }else
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameNachName='" + nameNachName + '\'' +
                ", AusweissNo='" + AusweissNo + '\'' +
                ", alter=" + alter +
                '}';
    }
}
