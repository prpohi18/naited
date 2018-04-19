package ktnaide;
public class Joogivaat{
    public double maxruumala;
    public double kogusliitrites;
    Jook sisu;
    public Joogivaat(double maxruumala, double kogusliitrites, Jook sisu){
        this.maxruumala=maxruumala;
        this.kogusliitrites=kogusliitrites;
        this.sisu=sisu;
    }
    
    public Joogipudel taida(Joogipudel pudel){
        if(pudel.sisu!=null){return pudel;}
        if(pudel.maht>this.kogusliitrites){return pudel;}
        kogusliitrites-=pudel.maht;
        pudel.sisu=this.sisu;
        return pudel;
    }
}