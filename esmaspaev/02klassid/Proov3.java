import java.util.*;
public class Proov3{
    public static void main(String[] arg){
        List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
        Map<Integer, Integer> aastasagedused=new HashMap<Integer, Integer>();
        //Lugege iga kuunime kohta, mitu inimest on seal sündinud
        isikukoodid.add(new Isikukood("37605030299"));
        isikukoodid.add(new Isikukood("50804250357"));
        isikukoodid.add(new Isikukood("50805280359"));        
        for(Isikukood kood: isikukoodid){
            int aasta=kood.aastaarv4kohta();
            if(aastasagedused.get(aasta)==null){
                aastasagedused.put(aasta, 1);
            } else {
                int kogus=aastasagedused.get(aasta);
                aastasagedused.put(aasta, kogus+1);
            }
        }
        System.out.println(aastasagedused);
        isikukoodid.stream().forEach(System.out::println);
        for(int i=0; i<isikukoodid.size(); i++){
            System.out.println(isikukoodid.get(i));
        }
    }
}