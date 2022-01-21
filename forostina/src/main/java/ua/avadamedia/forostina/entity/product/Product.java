package ua.avadamedia.forostina.entity.product;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private ProductCategory category;

    @Enumerated(EnumType.STRING)
    private MeasureUnit measureUnit;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double width;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double weight;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal incomePrice;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal partnerPrice;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal wholesalePrice;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal retailPrice;
}
