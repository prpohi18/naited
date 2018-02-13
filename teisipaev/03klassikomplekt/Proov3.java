import java.io.*;
public class Proov3{
    public static double[] loeSuund(){
        try{
           BufferedReader br=new BufferedReader(new FileReader("juht.txt"));
           String rida=br.readLine();
           if(rida.startsWith("p")){return new double[]{1, 0};}
           if(rida.startsWith("v")){return new double[]{-1, 0};}
           if(rida.startsWith("y")){return new double[]{0, -1};}
           if(rida.startsWith("a")){return new double[]{0, 1};}
        }catch(Exception ex){}
        return null;        
    }
    public static void main(String[] arg) throws Exception{
        Ala a=new Ala(10, 10);
        Ruut r1=a.lisaRuut(4, 5, 5);
        r1.suund(0.5, 0.2);
        Ruut r2=a.lisaRuut(6, 5, 2);
        r2.suund(-0.1, 1);
        for(int i=0; i<50000; i++){
          System.out.println(a);
          double[] suund=loeSuund();
          if(suund!=null){
              r1.suund(suund[0], suund[1]);
          }
          Thread.sleep(200);
          a.liigutaRuute();
          if(i % 20 ==0){
              a.lisaRuut((int)(Math.random()*a.veerge()), 
                         (int)(Math.random()*a.ridu()), 1);
          }          
        }
    }
}