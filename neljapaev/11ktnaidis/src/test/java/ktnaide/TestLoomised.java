package ktnaide;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLoomised {
    public TestLoomised(){}
    @Test
    public void jook(){
        Jook siirup=new Jook("piparkoogisiirup", 3.5, 1.5);
        assertEquals("piparkoogisiirup", siirup.nimetus);
        assertEquals(3.5, siirup.liitriomahind, 0.001);
        assertEquals(1.5, siirup.erikaal, 0.0001);
    }
    @Test
    public void pudel(){
        Jook siirup=new Jook("piparkoogisiirup", 3.5, 1.5);
        Joogipudel siirupiPudel=new Joogipudel(0.5, "plastik", 0.02, 0.1, siirup);        
        Joogipudel tyhiPudel=new Joogipudel(0.5, "plastik", 0.02, 0.1, null);        
        assertEquals(0.77, siirupiPudel.koguMass(), 0.01);
        assertEquals(0.02, tyhiPudel.koguMass(), 0.01);
        assertEquals(1.85, siirupiPudel.koguHind(), 0.01);
        assertEquals(0.1, tyhiPudel.koguHind(), 0.001);
        assertEquals("plastik", siirupiPudel.pudelityyp);
    }
    @Test
    public void vaat(){
        Joogivaat vaat=new Joogivaat(50, 23, new Jook("Kali", 0.15, 1.01));
        assertEquals(50, vaat.maxruumala, 0.01);
        assertEquals(23, vaat.kogusliitrites, 0.01);
        assertEquals("Kali", vaat.sisu.nimetus);
        Joogipudel p1=new Joogipudel(0.5, "plastik", 0.01, 0.1, null);
        p1=vaat.taida(p1);
        assertEquals("Kali", p1.sisu.nimetus);
        assertEquals(22.5, vaat.kogusliitrites, 0.01);
    }
}