public class Ilm{
    public static String kooliminekuHinnang(int temperatuur){
        if(temperatuur<-28){return "Pead külmapüha";}
        return "Lähed kooli";
    }
    /**
    *  Koosta funktsioon riietuse soovitamiseks
    *  Arvesta mitmesuguseid temperatuure ning võimalusel
    *  ka sademeid ja muid ilmastikunähtusi
    */
    public static String riietuseHinnang(
      int temperatuur, int sademed){
        if(temperatuur<-10){
            String[] talveriided={
                "pruun mantel", "vanaisa kasukas", "buhvaika"};
          return talveriided[(int)(Math.random()*talveriided.length)];
        }
        return (sademed>0) ? "vihmavari" : "jope";        
    }
    public static void main(String[] arg){
        int temperatuur=-15;
        int sademed=0;
        //Kui temperatuur [ja sademed] sisestatakse käsurealt,
        //siis arvestatakse neid väärtusi
        try{
          if(arg.length>0){temperatuur=Integer.parseInt(arg[0]);}
          if(arg.length>1){sademed=Integer.parseInt(arg[1]);}
        } catch(Exception e){
            System.out.println(
             "Kasuta kujul java Ilm [temperatuur] [sademed], nt ");
            System.out.println("java Ilm -15 2"); 
            return;            
        }
        System.out.println(kooliminekuHinnang(temperatuur));
        System.out.println(riietuseHinnang(temperatuur, sademed));
    }
}