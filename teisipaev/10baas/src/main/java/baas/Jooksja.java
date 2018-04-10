package baas;
import javax.persistence.*;

@Entity
@Table(name="jooksjad")
public class Jooksja{
    @Id
    public String email;
    public int synniaasta;
    public int voistlustearv;    
}