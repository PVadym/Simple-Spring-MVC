package ua.avadamedia.forostina.service.product;

import ua.avadamedia.forostina.entity.product.ProductCategory;

import java.util.Set;

public interface ProductService {

    Set<ProductCategory> getAllProductCategories();

    void deactivateProductCategory(Long id);
}
