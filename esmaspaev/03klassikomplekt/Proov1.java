public class Proov1{
    public static void main(String[] arg){
        Konto k1=new Konto("EE9678");
        System.out.println(k1.kasOlemas());
        System.out.println(k1.lisaSumma(5));
        Kontor k=new Kontor();
        System.out.println(k.kontoSisu("ABC"));
        System.out.println(k.kontoSisu("EE9678"));
        
    }
}