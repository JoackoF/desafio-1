package udb.edu.sv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.edu.sv.domain.*;

public interface AlumnoRepository extends JpaRepository<Profesor, Long> {
}
