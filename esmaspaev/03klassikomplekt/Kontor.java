import java.util.*;
import java.io.*;
public class Kontor{
    Map<String, Konto> kontod=new HashMap<String, Konto>();
    public Kontor(){
        loeKontod();
    }
    protected void loeKontod(){
        String[] fnimed=new File(Konto.kontokaust).list();
        for(String fnimi: fnimed){
            String[] m=fnimi.split("\\.");
            if(m.length==2){
              kontod.put(m[0], new Konto(m[0]));
              System.out.println("Loodi: "+m[0]);
            }
        }
    }
    public String kontoSisu(String kontonr){
        if(kontod.get(kontonr)!=null){
            return "Konto "+kontonr+" saldo "+kontod.get(kontonr).loeSumma();
        }
        return "Konto "+kontonr+" puudub";
    }
    //Lisa käsklus raha üle kandmiseks ühelt kontolt teisele
    public boolean ylekanne(String kellelt, String kellele, int summa){
        if(kontod.get(kellelt)==null){return false;}        
        if(kontod.get(kellele)==null){return false;}        
        if(kontod.get(kellelt).loeSumma()<summa){return false;}
        kontod.get(kellelt).eemaldaSumma(summa);
        kontod.get(kellele).lisaSumma(summa);
        return true;
    }
}