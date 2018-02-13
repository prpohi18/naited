public class Proov1{
    public static void main(String[] args){
        Plastiliin tykk1=new Plastiliin(10);
        Plastiliin tykk2=new Plastiliin(15);
        System.out.println(tykk1);
        System.out.println(tykk2);
        System.out.println("Esimese tüki mass "+tykk1.massKg()+" kilogrammi");
        //Kuva kahe tüki masside summa kilogrammides
        System.out.println("Kahe tüki mass kokku "+
           (tykk1.massKg()+tykk2.massKg())+" kilogrammi");
        System.out.println(tykk1.mass(Massiyhik.KILOGRAMM));
        //System.out.println(tykk1.mass(null));
        Plastiliin tykk3=tykk2.eralda(2);
        System.out.println(tykk1+" "+tykk2+" "+tykk3+".");
        tykk1.yhenda(tykk2.eralda(4));
        System.out.println(tykk1+" "+tykk2+" "+tykk3+".");
        tykk1.yhenda(tykk2);
        System.out.println("Tükkide massid: "+tykk1.mass(Massiyhik.GRAMM)+
          " ja "+tykk2.mass(Massiyhik.GRAMM)+ " grammi");
    }
}