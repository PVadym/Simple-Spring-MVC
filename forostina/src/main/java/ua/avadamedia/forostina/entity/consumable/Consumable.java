package ua.avadamedia.forostina.entity.consumable;

import lombok.Data;
import ua.avadamedia.forostina.entity.product.MeasureUnit;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Consumable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private MeasureUnit measureUnit;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double width;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal price;

}
