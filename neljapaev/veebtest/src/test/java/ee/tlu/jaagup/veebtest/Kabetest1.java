package ee.tlu.jaagup.veebtest;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class Kabetest1 {
   public Kabetest1(){}
   @Test
   public void avamine(){
       open("http://www.tlu.ee/~jaagup/veeb1/kabe1.html");
       $("h1").shouldHave(text("Kabe"));
       assertEquals("tume", 
               $("#tabel1").$$("tr").get(0).
                      $$("td").get(1).getAttribute("class"));
       assertEquals("", 
               $("#tabel1").$$("tr").get(0).
                      $$("td").get(0).getAttribute("class"));
       
      $("#tabel1").$$("tr").get(7).
                      $$("td").get(0).shouldHave(text("v"));
      $("#tabel1").$$("tr").get(0).
                      $$("td").get(1).shouldHave(text("m"));
      assertEquals("k01",
        $("#tabel1").$$("tr").get(0).
                      $$("td").get(1).getAttribute("id"));
   }
   @Test
   public void liikumine(){
      open("http://www.tlu.ee/~jaagup/veeb1/kabe1.html");
      $("#tabel1").$$("tr").get(5).
                      $$("td").get(0).shouldHave(text("v"));
      $("#tabel1").$$("tr").get(4).
                      $$("td").get(1).shouldHave(text(""));
      $("#k50").click();
      $("#k41").click();
      $("#k50").shouldHave(text(""));
      $("#k41").shouldHave(text("v"));
      //Pange käimine tööle veebilehel
      //Koostage test kontrollimaks, et valget nuppu võib
      //liigutada ainult diagonaalis ühe sammu võrra üles
      //muul juhul peab ekraanil vastavasse lahtrisse ilmuma veateade
      $("#k52").click();
      $("#k34").click();
      $("#teated").shouldHave(text("Lubamatu käik"));
      $("#k52").shouldHave(text("v"));
      $("#k34").shouldHave(text(""));
      $("#k54").click();
      $("#k45").click();
      $("#k54").shouldHave(text(""));
      $("#k45").shouldHave(text("v"));
   }
}
