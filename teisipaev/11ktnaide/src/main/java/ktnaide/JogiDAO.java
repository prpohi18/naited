package ktnaide;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface JogiDAO extends CrudRepository<Jogi, String>{}