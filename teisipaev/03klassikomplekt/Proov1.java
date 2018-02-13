public class Proov1{
    public static void main(String[] arg) throws Exception{
        Ala a=new Ala(10, 10);
        Ruut r1=a.lisaRuut(4, 5, 5);
        r1.suund(0.5, 0);
        a.lisaRuut(6, 5, 2);
        for(int i=0; i<50; i++){
          System.out.println(a);
          Thread.sleep(1000);
          a.liigutaRuute();
        }
    }
}