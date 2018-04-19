public class Proov1{
    public static void main(String[] args){
        Jogi j1=new Jogi();
        j1.nimetus="Pirita jõgi";
        Jogi j2=new Jogi();
        j2.nimetus="Kuivajõgi";
        Jogi j3=new Jogi();
        j3.nimetus="Kirivalla oja";
        j3.pikkus=10; //km
        j3.sihtjogi=j2;
        j3.suudmeKaugusSihtjoeSuudmest=12;
        j2.pikkus=20;
        j2.sihtjogi=j1;
        j1.pikkus=100;
        j2.suudmeKaugusSihtjoeSuudmest=50;
        j1.sihtjogi=null;
        Jogi uuritav=j3;
        double kogukaugus=uuritav.pikkus;
        while(uuritav!=null){
            System.out.println(uuritav.nimetus);
            kogukaugus+=uuritav.suudmeKaugusSihtjoeSuudmest;
            uuritav=uuritav.sihtjogi;                             
        }
        System.out.println(kogukaugus);
        System.out.println(j3.kaugusMereni(8));
        System.out.println(j3.nimedMereni());
        
    }
}