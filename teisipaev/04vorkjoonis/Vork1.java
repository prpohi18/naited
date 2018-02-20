import java.net.*;
import java.io.*;
public class Vork1{
    public static void main(String[] arg) throws Exception{
        String aadress="http://www.tlu.ee/~jaagup/veeb1/pikkused.txt";
        BufferedReader br=new BufferedReader(new InputStreamReader(
           new URL(aadress).openStream()
        ));
        String rida=br.readLine();
        int loendur=0;
        int summa=0;
        while(rida!=null){
            //Trükkige arvude ette reanumbrid
            System.out.println(++loendur + " "+rida);
            summa+=Integer.parseInt(rida);
            rida=br.readLine();
        }
        //Kuvage arvude summa ja aritmeetiline keskmine
        System.out.println(summa+" "+summa*1.0/loendur);
        br.close();
    }
}