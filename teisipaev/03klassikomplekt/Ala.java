import java.util.*;
public class Ala{
    Ruut[][] ruudud;
    int veergudearv, ridadearv;
    public Ala(int veergudearv, int ridadearv){
        this.ridadearv=ridadearv;
        this.veergudearv=veergudearv;
        this.ruudud=new Ruut[veergudearv][ridadearv]; // x enne
    }
    public int ridu(){return ridadearv;}
    public int veerge(){return veergudearv;}
    public Ruut lisaRuut(int x, int y, int suurus){
        if(ruudud[x][y]!=null){return null;}
        ruudud[x][y]=new Ruut(x, y, suurus);
        return ruudud[x][y];
    }
    public void liigutaRuute(){
        Ruut[][] abiruudud=new Ruut[veergudearv][ridadearv];
        for(int rida=0; rida<ridadearv; rida++){
            for(int veerg=0; veerg<veergudearv; veerg++){
                Ruut r=ruudud[veerg][rida];
                if(r!=null){
                    //ruudud[veerg][rida]=null;
                    r.liigu(this);
                    if(abiruudud[r.getX()][r.getY()]!=null){
                        if(r.kysiSuurus()>abiruudud[r.getX()][r.getY()].kysiSuurus()){
                            r.muudaSuurus(r.kysiSuurus()+abiruudud[r.getX()][r.getY()].kysiSuurus());
                            abiruudud[r.getX()][r.getY()]=r;
                        } else {
                           abiruudud[r.getX()][r.getY()].muudaSuurus(
                             abiruudud[r.getX()][r.getY()].kysiSuurus()+r.kysiSuurus()
                           );
                        }
                    } else {
                        abiruudud[r.getX()][r.getY()]=r;
                    }
                }
            }
        }
        ruudud=abiruudud;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int rida=0; rida<ridadearv; rida++){
            for(int veerg=0; veerg<veergudearv; veerg++){
                if(ruudud[veerg][rida]==null){
                  sb.append(" .");  
                } else {
                  sb.append(ruudud[veerg][rida]);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}