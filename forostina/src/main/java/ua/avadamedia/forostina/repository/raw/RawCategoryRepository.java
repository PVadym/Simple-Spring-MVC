package ua.avadamedia.forostina.repository.raw;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.avadamedia.forostina.entity.raw.RawCategory;

import java.util.Set;

public interface RawCategoryRepository extends JpaRepository<RawCategory, Long> {

    Set<RawCategory> findAllByActiveTrueOrderByName();
}
