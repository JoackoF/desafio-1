package udb.edu.sv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import udb.edu.sv.domain.Profesor;
import udb.edu.sv.repository.ProfesorRepository;

@SpringBootTest
public class PersistenceTest {

	@Autowired
	private ProfesorRepository profesorRepo;

	@Test
	@Transactional
	@Commit
	void testInsert() {
		profesorRepo.save(new Profesor(null, "Profesor Extra 1"));
		profesorRepo.save(new Profesor(null, "Profesor Extra 2"));
	}
}