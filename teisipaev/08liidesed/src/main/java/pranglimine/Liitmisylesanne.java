package pranglimine;
public class Liitmisylesanne{
    int liidetav1;
    int liidetav2;
    int summa;
    public Liitmisylesanne(int arv1, int arv2){
        liidetav1=arv1;
        liidetav2=arv2;
        summa=liidetav1+liidetav2;
    }
    @Override
    public String toString(){
        return liidetav1+"+"+liidetav2+"=";
    }
    public int kysiSumma(){
        return summa;
    }
    public int kysiLiidetav1(){
        return liidetav1;
    }
    public int kysiLiidetav2(){
        return liidetav2;
    }
}