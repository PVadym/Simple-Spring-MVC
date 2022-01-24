package ua.avadamedia.forostina.service.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.avadamedia.forostina.entity.product.ProductCategory;
import ua.avadamedia.forostina.repository.product.ProductCategoryRepository;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public Set<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAllByActiveTrueOrderByName();
    }

    @Override
    public void deactivateProductCategory(Long id) {
        productCategoryRepository.findById(id).ifPresent(productCategory -> {
            productCategory.setActive(false);
            productCategoryRepository.save(productCategory);
        });

    }
}
