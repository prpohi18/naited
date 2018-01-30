package teisipaev01;
import java.util.Arrays;
public class Teisipaev01 {    
    public static String piletityyp(int vanus){
       if(vanus<7){return "Tasuta";}
       //Lisage ka soodus- ja täispilet
       if(vanus<21){return "Õpilaspilet";}
       if(vanus>65){return "Pensionäri pilet";}
       return "Täispilet";
    }
    public static String[] piletityybid(int[] vanused){
       String[] vastused=new String[vanused.length];
       for(int i=0; i<vanused.length; i++){
          vastused[i]=piletityyp(vanused[i]);
       }
       return vastused;
    }
    public static void main(String[] args) {
        System.out.println(piletityyp(15));
        int[] vanused=new int[3];
        vanused[0]=75;
        vanused[1]=5;
        vanused[2]=40;
        System.out.println(vanused[2]);
        System.out.println(Arrays.toString(vanused));
        System.out.println(Arrays.toString(piletityybid(vanused)));
    }  
}
