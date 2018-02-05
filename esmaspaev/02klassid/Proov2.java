import java.util.Arrays;
public class Proov2{
    public static void main(String[] arg){
        Isikukood[] isikukoodid=new Isikukood[2];
        isikukoodid[0]=new Isikukood("37605030299");
        isikukoodid[1]=new Isikukood("50804250357");
        for(int i=0; i<isikukoodid.length; i++){
            System.out.println(isikukoodid[i].aastaarv4kohta());
        }
        for(Isikukood kood: isikukoodid){
            System.out.println(kood.aastaarv4kohta());
        }
        Arrays.stream(isikukoodid).forEach(
          (kood)->{System.out.println(kood.aastaarv4kohta());});
          
        Arrays.stream(isikukoodid).forEach(
          (kood)->System.out.println(kood.aastaarv4kohta()) );
          
        Arrays.stream(isikukoodid).forEach(System.out::println);
    }
}