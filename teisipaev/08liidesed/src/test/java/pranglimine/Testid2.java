package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid2{
    @Test
    public void ylesanneteKomplektiLoomine(){
//        YlesanneteKomplektiLiides komplekt=null;
        YlesanneteKomplektiLiides komplekt=new YlesanneteLihtneKomplekt();
        komplekt.lisaYlesanne(new Liitmisylesanne(3, 5));
        komplekt.lisaYlesanne(new Liitmisylesanne(4, 6));
        assertEquals("3+5=\n4+6=", komplekt.ylesandedTekstina());
        //Koostage klass ülesannete komplekti tarbeks, nii et selle töö vastaks testis kirjeldatule
    }
}