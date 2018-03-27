package pranglimine;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void ylesandeLoomine(){
        Liitmisylesanne yl=new Liitmisylesanne(3, 2);
        assertEquals("3+2=", yl.toString());
        assertEquals(5, yl.kysiSumma());
    }
    @Test
    public void ylesandeLoomineLiidesest(){
        LiitmisylesanneteLoojaLiides looja=new LiitmisylesanneteTavalineLooja();
        Liitmisylesanne yl=looja.looLiitmisylesanne(100);
        assertTrue(yl.kysiSumma()<=100);
        assertEquals(yl.kysiSumma(), yl.kysiLiidetav1()+yl.kysiLiidetav2());
    }
    @Test
    public void juhuarvuLoomine(){
        JuhuarvudeGeneraatoriLiides generaator=new JuhuarvudeYhtlaneGeneraator();
        boolean yksLeitud=false;
        boolean viisLeitud=false;
        for(int i=0; i<1000; i++){
            int arv=generaator.looJuhuarv(1, 5);
            assertTrue(arv>=1);
            assertTrue(arv<=5);
            if(arv==1){yksLeitud=true;}
            if(arv==5){viisLeitud=true;}
        }
        assertTrue(yksLeitud);
        assertTrue(viisLeitud);
    }
}