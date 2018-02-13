public class Plastiliin{
    protected double massgr; 
    public Plastiliin(double mass){
        massgr=mass;
    }
    public String toString(){
        return "Plastiliinitykk massiga "+massgr+" grammi";
    }
    //Lisa käsklus kuvamaks massi kilogrammides, katseta
    public double massKg(){
        return massgr/1000.0;
    }
    public double mass(Massiyhik yhik){
        if(yhik==Massiyhik.GRAMM){return massgr;}
        if(yhik==Massiyhik.KILOGRAMM){return massgr/1000;}
        //if(yhik==Massiyhik.NAEL){return massgr/453;}
        if(yhik==Massiyhik.MILLIGRAMM){return massgr*1000;}
        //Lisa arvutused ka naelte ja milligrammide kohta
        if(yhik==null){
           throw new RuntimeException("Ühik puudub");
        }
        throw new RuntimeException("tundmatu ühik " + yhik);
    }
    public Plastiliin yhenda(Plastiliin lisatav){
        massgr+=lisatav.massgr;
        lisatav.massgr=0;
        return this;
    }
    public Plastiliin eralda(double grammid){
        if(grammid>massgr){
            throw new RuntimeException("ei jagu piisavalt");
        }
        Plastiliin uus=new Plastiliin(grammid);
        massgr-=grammid;
        return uus;
    }
}