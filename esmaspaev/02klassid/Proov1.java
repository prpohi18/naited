public class Proov1{
    public static void main(String[] arg){
        Isikukood jaagup=new Isikukood("37605030299");
        Isikukood toomas=new Isikukood("50804250357");
        System.out.println("Kuu nr "+jaagup.kuunr()+" nimega "+jaagup.kuunimi()+
           ", päev nr "+jaagup.paevanr());

        System.out.println(toomas.kuunr()+" "+toomas.aastaarv4kohta());
    }
}