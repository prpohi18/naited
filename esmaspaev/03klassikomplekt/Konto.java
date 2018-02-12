import java.io.*;
public class Konto{
    protected String kontonr;
    public static final String kontokaust="kontod/";
    public Konto(String kontonr){
        this.kontonr=kontonr;
        looKonto();
    }
    public String kysiKontoNr(){
        return kontonr;
    }
    public boolean kasOlemas(){
        return new File(kontoFailiNimi()).exists();
    }
    protected String kontoFailiNimi(){
        return kontokaust+kontonr+".txt";
    }
    protected void looKonto(){
        if(!kasOlemas()){
          kirjutaSumma(0);
        }
    }
    public int loeSumma(){
        try{
           BufferedReader br=new BufferedReader(new FileReader(kontoFailiNimi()));
           int summa=Integer.parseInt(br.readLine());           
           br.close();
           return summa;
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    public boolean kirjutaSumma(int eurod){
          try{
            PrintWriter pw=new PrintWriter(new FileWriter(kontoFailiNimi()));
            pw.println(eurod);
            pw.close();
            return true;
           } catch(Exception ex){
               ex.printStackTrace();
           }
           return false;
    }
    public int lisaSumma(int eurod){
        if(eurod<0){throw new RuntimeException("negatiivne summa");}
        int sisu=loeSumma();
        sisu+=eurod;
        kirjutaSumma(sisu);
        return sisu;
    }
    public int eemaldaSumma(int eurod){
        int sisu=loeSumma();
        sisu-=eurod;
        kirjutaSumma(sisu);
        return sisu;
    }
}