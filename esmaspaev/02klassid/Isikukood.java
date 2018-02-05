public class Isikukood{
    protected String andmed;
    public Isikukood(String uusKood){
        andmed=uusKood;
    }
    public int kuunr(){
        return Integer.parseInt(andmed.substring(3, 5));
    }
    public String kuunimi(){
        String[] kuunimed={"","jaanuar","veebruar","märts","aprill",
          "mai","juuni","juuli","august",
          "september","oktoober","november","detsember"};
        return kuunimed[kuunr()];
    }
    //Lisage käsk neljakohalise aasta väljastamiseks
    public int aastaarv4kohta(){
        return (18+(Integer.parseInt(andmed.substring(0, 1))-1)/2)*100+
         Integer.parseInt(andmed.substring(1, 3));
    }
    //Looge käsk päevanumbri kuvamiseks, katsetage
    public int paevanr(){
        return Integer.parseInt(andmed.substring(5, 7));        
    }
}