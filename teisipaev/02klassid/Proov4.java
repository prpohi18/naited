import java.io.*;
import java.util.*;
public class Proov4{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("tykisuurused.txt"));
        List<Plastiliin> tykid=new ArrayList<Plastiliin>();
        String rida=br.readLine();
        while(rida!=null){
            tykid.add(new Plastiliin(Integer.parseInt(rida)));
            rida=br.readLine();
        }
        br.close();
        System.out.println(tykid);
        PrintWriter pw=new PrintWriter(new FileWriter("vastus.txt"));
        tykid.stream().reduce((t1, t2)->t1.yhenda(t2)).
          ifPresent(t->pw.println(t));
        pw.close();
    }
}