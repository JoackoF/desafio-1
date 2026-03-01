package udb.edu.sv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import udb.edu.sv.domain.Alumno;
import udb.edu.sv.domain.Materia;
import udb.edu.sv.domain.Profesor;
import udb.edu.sv.repository.AlumnoRepository;
import udb.edu.sv.repository.MateriaRepository;
import udb.edu.sv.repository.ProfesorRepository;

@SpringBootTest
@Transactional
@Commit
public class PruebasUnitarias {

    @Autowired
    private ProfesorRepository profesorRepo;

    @Autowired
    private MateriaRepository materiaRepo;

    @Autowired
    private AlumnoRepository alumnoRepo;

    // Test profesor
    @Test
    void insertarProfesoresTest() {

        Profesor p1 = new Profesor();
        p1.setNombre("Profesor Test A");
        profesorRepo.save(p1);

        Profesor p2 = new Profesor();
        p2.setNombre("Profesor Test B");
        profesorRepo.save(p2);

        System.out.println("Profesores totales: " + profesorRepo.count());
    }

    // Test Materia
    @Test
    void insertarMateriasTest() {

        // Profesor requerido por la FK
        Profesor prof = new Profesor();
        prof.setNombre("Profesor Materia Test");
        profesorRepo.save(prof);

        Materia m1 = new Materia();
        m1.setNombre("Materia Test 1");
        m1.setProfesor(prof);
        materiaRepo.save(m1);

        Materia m2 = new Materia();
        m2.setNombre("Materia Test 2");
        m2.setProfesor(prof);
        materiaRepo.save(m2);

        System.out.println("Materias totales: " + materiaRepo.count());
    }

    // Test alumno
    @Test
    void insertarAlumnosTest() {

        Alumno a1 = new Alumno();
        a1.setNombre("Alumno Test");
        a1.setApellido("Uno");
        alumnoRepo.save(a1);

        Alumno a2 = new Alumno();
        a2.setNombre("Alumno Test");
        a2.setApellido("Dos");
        alumnoRepo.save(a2);

        System.out.println("Alumnos totales: " + alumnoRepo.count());
    }
    //Test Alumno Materia
    @Test
    void insertarAlumnoMateriaTest() {

        Profesor prof = new Profesor();
        prof.setNombre("Profesor Relación");
        profesorRepo.save(prof);

        Materia m1 = new Materia();
        m1.setNombre("Materia Rel 1");
        m1.setProfesor(prof);
        materiaRepo.save(m1);

        Materia m2 = new Materia();
        m2.setNombre("Materia Rel 2");
        m2.setProfesor(prof);
        materiaRepo.save(m2);

        Alumno a1 = new Alumno();
        a1.setNombre("Alumno Rel");
        a1.setApellido("Uno");

        Alumno a2 = new Alumno();
        a2.setNombre("Alumno Rel");
        a2.setApellido("Dos");

        a1.getMaterias().add(m1);
        a2.getMaterias().add(m2);

        alumnoRepo.save(a1);
        alumnoRepo.save(a2);

        System.out.println("Relaciones alumno-materia insertadas");
    }
}