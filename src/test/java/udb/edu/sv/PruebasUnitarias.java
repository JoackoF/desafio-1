package udb.edu.sv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import udb.edu.sv.domain.Profesor;
import udb.edu.sv.repository.ProfesorRepository;

@SpringBootTest
@Transactional
@Commit
public class PruebasUnitarias {

    @Autowired
    private ProfesorRepository profesorRepo;

    @Test
    void insertarProfesoresTest() {
        Profesor p1 = new Profesor();
        p1.setNombre("Profesor Test 1");
        profesorRepo.save(p1);

        Profesor p2 = new Profesor();
        p2.setNombre("Profesor Test 2");
        profesorRepo.save(p2);
    }
}