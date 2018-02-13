public class Ruut{
    double x;
    double y;
    int suurus;
    double dx;
    double dy;
    public Ruut(int x, int y, int suurus){
        this.x=x;
        this.y=y;
        this.suurus=suurus;
    }
    public int getX(){return (int)x;}
    public int getY(){return (int)y;}  
    public int kysiSuurus(){return suurus;}
    public void muudaSuurus(int uusSuurus){suurus=uusSuurus;}
    public void suund(double dx, double dy){
        this.dx=dx; this.dy=dy;
    }
    public void liigu(Ala ala){
        x+=dx; y+=dy;
        if(x>ala.veerge()-1){x=ala.veerge()-1; dx=-Math.abs(dx);}
        if(y>ala.ridu()-1){y=ala.ridu()-1; dy=-Math.abs(dy);}
        if(x<0){x=0; dx=Math.abs(dx);}
        if(y<0){y=0; dy=Math.abs(dy);}
    }
    public String toString(){
        String abi=String.valueOf(suurus);
        if(abi.length()<2){abi=" "+abi;}
        return abi;
    }    
}