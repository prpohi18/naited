public class Andmed2{
    //Koosta funktsioon arvude summa leidmiseks, katseta
    public static int leiaSumma(int[] arvud){
        int summa=0;
        for(int arv: arvud){summa+=arv;}
        return summa;
    }
    public static int[] arvudeks(String[] andmed){
        int[] arvud=new int[andmed.length];
        for(int i=0; i<andmed.length; i++){
            arvud[i]=Integer.parseInt(andmed[i]);
        }
        return arvud;
    }
    public static void main(String[] arg){
        int[] a=arvudeks(arg);
        System.out.println(leiaSumma(a));
    }
}