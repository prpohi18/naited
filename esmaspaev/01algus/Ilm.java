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
        System.out.println(kooliminekuHinnang(temperatuur));
        System.out.println(riietuseHinnang(temperatuur, 2));
    }
}