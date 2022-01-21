package ua.avadamedia.forostina.entity.store;

import lombok.Data;
import ua.avadamedia.forostina.entity.product.Product;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate creationDate;

    @ManyToOne
    private Product product;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double quantity;


}
