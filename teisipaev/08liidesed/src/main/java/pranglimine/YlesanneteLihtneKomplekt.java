package pranglimine;
import java.util.*;
public class YlesanneteLihtneKomplekt implements YlesanneteKomplektiLiides{
    List<Liitmisylesanne> hoidla=new ArrayList<Liitmisylesanne>();
    public void lisaYlesanne(Liitmisylesanne ylesanne){
        hoidla.add(ylesanne);
    }
    public String ylesandedTekstina(){
        StringBuilder sb=new StringBuilder();
        boolean alustatud=false;
        for(Liitmisylesanne y: hoidla){
            if(alustatud){sb.append("\n");}
            sb.append(y);
            alustatud=true;
        }
        return sb.toString();
    }
}