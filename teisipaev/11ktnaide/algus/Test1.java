import org.junit.*;
import static org.junit.Assert.*;

public class Test1{
    @Test
    public void nimerida(){
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
        assertEquals("Kirivalla oja-Kuivajõgi-Pirita jõgi-meri", j3.nimedMereni());
        assertEquals(67, j3.kaugusMereni(5), 0.1);
    }
}

/*

[jaagup@greeny algus]$ java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore Test1
JUnit version 4.12
.
Time: 0.009

OK (1 test)

*/