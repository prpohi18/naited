package baas;
import javax.transaction.*;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface KoerDAO extends CrudRepository<Koer, Integer>{}