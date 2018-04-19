public class Jogi{
    Jogi sihtjogi;
    double suudmeKaugusSihtjoeSuudmest;
    String nimetus;
    double pikkus;
    double vooluhulk;
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