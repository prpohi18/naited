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
    private KoerDAO koerDao;
    
    @RequestMapping("/tervitus")
    public String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
    
    @RequestMapping("/loetelu")
    public Iterable<Koer> loetelu(){
        return koerDao.findAll();
    }
    
    @RequestMapping("/lisa")
    public String lisa(String koeranimi, int synniaasta){
        Koer k=new Koer();
        k.koeranimi=koeranimi;
        k.synniaasta=synniaasta;
        koerDao.save(k);
        return "Lisati "+koeranimi;
    }
    
    //http://greeny.cs.tlu.ee:43256/muuda?id=3&koeranimi=Mursilka&synniaasta=2005
    @RequestMapping("/muuda")
    public String lisa(int id, String koeranimi, int synniaasta){
        Koer k=koerDao.findOne(id);
        if(k==null){return "Koer nr "+id+" puudub";}
        k.koeranimi=koeranimi;
        k.synniaasta=synniaasta;
        koerDao.save(k);
        return "muudeti "+koeranimi+" numbriga "+id;
    }
    
    //Koostage ka koera kustutamise funktsioon

    @RequestMapping("/kustuta")
    public String kustuta(int id){
        Koer k=koerDao.findOne(id);
        if(k==null){return "Koer nr "+id+" puudub";}
        koerDao.delete(k);
        return "kustutati koer "+id;
    }
    
   
    
    public static void main(String[] args){
        SpringApplication.run(Rakendus.class, args);
    }
}

//mvn package
//java -jar -Dserver.port=43256 target/baas1-1.jar
//http://greeny.cs.tlu.ee:43256/tervitus?eesnimi=Juku
