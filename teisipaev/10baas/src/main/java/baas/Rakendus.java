package baas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus{
    @Autowired
    private JooksjaDAO jooksjaDao;
    
    @RequestMapping("/tervitus")
    String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
    @RequestMapping("/lisa")
    public String lisa(String email, int synniaasta){
        Jooksja isik=new Jooksja();
        isik.email=email;
        isik.synniaasta=synniaasta;
        isik.voistlustearv=1;
        jooksjaDao.save(isik);
        return email+" salvestatud";
    }
    
    @RequestMapping("/kustuta")
    public String kustuta(String email){
        Jooksja isik=jooksjaDao.findOne(email);
        if(isik==null){return email+" puudub";}
        jooksjaDao.delete(isik);
        return email+" kustutatud";
    }
    
    @RequestMapping("/loetelu")
    public Iterable<Jooksja> loetelu(){
        return jooksjaDao.findAll();    
    }
    
    public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    }    
}

//java -jar -Dserver.port=42534 target/baas1-1.jar
