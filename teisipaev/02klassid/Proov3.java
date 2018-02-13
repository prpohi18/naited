import java.util.*;
public class Proov3{
    public static void main(String[] args){
        List<Plastiliin> tykid=new ArrayList<Plastiliin>();
        tykid.add(new Plastiliin(3));
        tykid.add(new Plastiliin(6));
        tykid.add(new Plastiliin(7));
        System.out.println(tykid);
        tykid.remove(0); 
        tykid.add(1, new Plastiliin(4));
        System.out.println(tykid);
        double summa=0;
        for(Plastiliin tykk: tykid){summa+=tykk.massKg();}
        System.out.println(summa);
        System.out.println(tykid.get(0)+" "+tykid.get(tykid.size()-1));
        //Leidke tükilisti summa järjekorranumbriga tsükli abil
        summa=0;
        for(int i=0; i<tykid.size(); i++){
            summa+=tykid.get(i).massKg();
        }
        System.out.println(summa);
        System.out.println(tykid.stream().
          mapToDouble((tykk)->tykk.mass(Massiyhik.GRAMM)).sum());
        System.out.println(tykid.stream().reduce((t1, t2)->t1.yhenda(t2)));
        tykid.stream().reduce((t1, t2)->t1.yhenda(t2)).
          ifPresent(t->System.out.println(t));
        
    }
}