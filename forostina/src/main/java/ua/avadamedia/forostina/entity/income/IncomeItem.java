package ua.avadamedia.forostina.entity.income;

import lombok.Data;
import ua.avadamedia.forostina.entity.raw.Raw;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class IncomeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Raw raw;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double quantity;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double length;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double output;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

}
