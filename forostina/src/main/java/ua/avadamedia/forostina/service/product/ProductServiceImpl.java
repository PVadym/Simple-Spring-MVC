package ua.avadamedia.forostina.service.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.avadamedia.forostina.entity.product.ProductCategory;
import ua.avadamedia.forostina.repository.product.ProductCategoryRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public Set<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAllByOrderByName();
    }
}
