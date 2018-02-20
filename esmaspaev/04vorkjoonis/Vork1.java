import java.net.*;
import java.io.*;

public class Vork1{
    public static void main(String[] arg) throws Exception{
        String aadress="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
        BufferedReader br=new BufferedReader(new InputStreamReader(
          new URL(aadress).openStream()));
        String rida=br.readLine();
        if(!rida.startsWith("liik")){
            System.out.println("sobiva pealkirjata fail");
            return;
        }
        rida=br.readLine();
        int kassidemassidesumma=0;
        while(rida!=null){
            System.out.println(rida);
            String[] m=rida.split(",");
            if(m[0].equals("kass")){
                kassidemassidesumma+=Integer.parseInt(m[1]);
            }
            rida=br.readLine();
        }
        System.out.println(kassidemassidesumma);        
    }
}