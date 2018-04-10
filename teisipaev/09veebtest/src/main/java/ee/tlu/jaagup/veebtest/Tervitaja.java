package ee.tlu.jaagup.veebtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;

public class Tervitaja {
    public static void main(String[] arg) throws Exception{
      System.out.println("tere");
      /*open("http://www.tlu.ee/");
      $("#search-string").setValue("Peeter Normak");
      $("#search-submit").click();
      System.out.println($(".tablewrapper").$$("tr").get(2).getText());*/
      
      open("http://www.google.ee/");
      $("#lst-ib").setValue("Peeter Normak");
      $(By.name("btnK")).click();
      //Kuvage otsingu vastuste pealkirjad
      Thread.sleep(5000);
    }
}
