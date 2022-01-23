package ua.avadamedia.forostina.service.raw;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.avadamedia.forostina.entity.raw.RawCategory;
import ua.avadamedia.forostina.repository.raw.RawCategoryRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class RawServiceImpl implements RawService{
    private final RawCategoryRepository rawCategoryRepository;

    @Override
    public Set<RawCategory> getAllRawCategories() {
        return rawCategoryRepository.findAllByOrderByName();
    }
}
