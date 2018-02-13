public class Proov2{
    public static void main(String[] arg) throws Exception{
        Ala a=new Ala(10, 10);
        Ruut r1=a.lisaRuut(4, 5, 5);
        r1.suund(0.5, 0.2);
        Ruut r2=a.lisaRuut(6, 5, 2);
        r2.suund(-0.1, 1);
        for(int i=0; i<50000; i++){
          System.out.println(a);
          Thread.sleep(200);
          a.liigutaRuute();
          if(i % 20 ==0){
              a.lisaRuut((int)(Math.random()*a.veerge()), 
                         (int)(Math.random()*a.ridu()), 1);
          }
        }
    }
}