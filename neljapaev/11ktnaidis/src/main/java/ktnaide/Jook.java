package ktnaide;
public class Jook{
    public String nimetus;
    public double liitriomahind;
    public double erikaal; //(kg/l)
    public Jook(String nimetus, double liitriomahind, double erikaal){
        this.nimetus=nimetus;
        this.liitriomahind=liitriomahind;
        this.erikaal=erikaal;
    }
    @Override
    public String toString(){
        return nimetus+", "+liitriomahind+" eur/liiter, "+erikaal+" kg/liiter";
    }
}