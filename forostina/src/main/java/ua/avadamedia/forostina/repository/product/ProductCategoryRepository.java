package ua.avadamedia.forostina.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.avadamedia.forostina.entity.product.ProductCategory;

import java.util.Set;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

    Set<ProductCategory> findAllByActiveTrueOrderByName();
}
