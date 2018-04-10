package ee.tlu.jaagup.selenide1;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
public class Proov1 {
    public static void main(String[] args){
      System.out.println("Kuku!!");
      open("http://www.tlu.ee/");
      $(By.name("search-string")).setValue("dti");
      $("#search-submit").click();
      //Püüdke leida otsingu esimene vaste ning kuvage see Java aknasse
      System.out.println($("ol.results").getText());
      open("http://greeny.cs.tlu.ee/~jaagup/2018/prpohi/naited/esmaspaev/09veebtest/html/arvutus1.html");
      $("#kast1").setValue("4");
      $("#kast2").setValue("6");
      $("#nupp1").click();
      System.out.println($("#vastus").getText());
    }
}
/*
  Koostage lin2 serverisse veebileht ristküliku pindala leidmiseks Javaskripti abil 
  Kontrolli lehe tööd automaattestidega.
*/

