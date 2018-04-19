package ktnaide;
import javax.persistence.*;

@Entity
@Table(name="joed")
public class Jogi{
    @Id
    public String nimetus;
    @ManyToOne
    @JoinColumn(name="sihtjoeNimetus")
    public Jogi sihtjogi;
    public double suudmeKaugusSihtjoeSuudmest;
    public double pikkus;
    public double vooluhulk;
    String nimedMereni(){
        if(sihtjogi==null){
            return nimetus+"-meri";
        }
        return nimetus+"-"+sihtjogi.nimedMereni();
    }
    double kaugusMereni(double kaugusJoeSuudmest){
        if(sihtjogi==null){
            return kaugusJoeSuudmest;
        }
        return kaugusJoeSuudmest+sihtjogi.kaugusMereni(suudmeKaugusSihtjoeSuudmest);
        
    }
}