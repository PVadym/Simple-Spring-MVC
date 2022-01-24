package ua.avadamedia.forostina.service.raw;

import ua.avadamedia.forostina.entity.raw.RawCategory;

import java.util.Set;

public interface RawService {

    Set<RawCategory> getAllRawCategories();

    void deactivateRawCategory(Long id);
}
