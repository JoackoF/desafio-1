package udb.edu.sv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import udb.edu.sv.domain.Profesor;
import udb.edu.sv.repository.ProfesorRepository;

@SpringBootTest
public class PruebasUnitarias {

    @Autowired
    private ProfesorRepository profesorRepo;

    @Test
    @Transactional
    @Commit
    void insertarDatosTest() {
        // Registro 1
        Profesor p1 = new Profesor();
        p1.setNombre("Nuevo Profesor A");
        profesorRepo.save(p1);

        // Registro 2
        Profesor p2 = new Profesor();
        p2.setNombre("Nuevo Profesor B");
        profesorRepo.save(p2);

        System.out.println("¡Insersión desde Test completada con éxito!");
    }

    @Test
    @Transactional
    void insertarDatosTest2() {
        Profesor p1 = new Profesor();
        p1.setNombre("Nuevo Profesor A");
        profesorRepo.save(p1);

        Profesor p2 = new Profesor();
        p2.setNombre("Nuevo Profesor B");
        profesorRepo.save(p2);

        System.out.println("Total profesores: " + profesorRepo.count());
    }
}