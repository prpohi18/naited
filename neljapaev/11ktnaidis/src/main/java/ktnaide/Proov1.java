package ktnaide;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Proov1{
    @RequestMapping("/tervitus")
    String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
    @RequestMapping("/vaat1")
    String vaat1(){
        Joogivaat vaat=new Joogivaat(50, 23, new Jook("Kali", 0.15, 1.01));
        Joogipudel p1=new Joogipudel(0.5, "plastik", 0.01, 0.1, null);
        p1=vaat.taida(p1);
        return "Vaat: "+vaat+", pudel: "+p1;
    }
    
    @RequestMapping("/vaat2")
    String vaat2(HttpSession session){
        if(session.getAttribute("kogusvaadis")==null){
            session.setAttribute("kogusvaadis", "23");
        }
        Joogivaat vaat=new Joogivaat(50, Double.parseDouble(
           (String)session.getAttribute("kogusvaadis")), new Jook("Kali", 0.15, 1.01));
        Joogipudel p1=new Joogipudel(0.5, "plastik", 0.01, 0.1, null);
        p1=vaat.taida(p1);
        session.setAttribute("kogusvaadis", vaat.kogusliitrites+"");
        return "Vaat: "+vaat.kogusliitrites+", pudel: "+p1;
    }
    public static void main(String[] arg){
         SpringApplication.run(Proov1.class, arg);
    }
}