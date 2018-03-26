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
}