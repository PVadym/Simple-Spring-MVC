package ua.avadamedia.forostina.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.avadamedia.forostina.entity.employee.Position;

import java.util.Set;

public interface PositionRepository extends JpaRepository<Position, Long> {

    Set<Position> findAllByOrderByName();

}
