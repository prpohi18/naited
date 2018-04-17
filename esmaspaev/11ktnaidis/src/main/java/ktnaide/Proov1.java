package ktnaide;
public class Proov1{
    public static void main(String[] arg){
        Jook j1=new Jook("piim", 0.31, 1.027);
        Jook j2=new Jook("õli", 0.68, 0.95);
        Joogipudel p1=new Joogipudel(1, "klaas", 0.4, 0.1, j1);
        System.out.println(p1);
    }
}