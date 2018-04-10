package pranglimine;
public class Proov1{
    public static void main(String[] args){
        YlesanneteKomplektiLiides komplekt=new YlesanneteLihtneKomplekt();
        komplekt.lisaYlesanne(new Liitmisylesanne(3, 2));
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        komplekt.lisaYlesanne(new Liitmisylesanne(generaator.looJuhuarv(1,5), generaator.looJuhuarv(1, 50)));
        LiitmisylesanneteLoojaLiides looja=new LiitmisylesanneteTavalineLooja();
        komplekt.lisaYlesanne(looja.looLiitmisylesanne(50));
        System.out.println(komplekt.ylesandedTekstina());
    }
}