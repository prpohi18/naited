/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.tlu.jaagup.veebtest;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test2 {
    
    public Test2() {
    }
    @Test
    public void arvutusTest(){
      assertEquals(5, 3+2);
        open("http://www.tlu.ee/~jaagup/veeb1/kabe1.html");
    }
}
