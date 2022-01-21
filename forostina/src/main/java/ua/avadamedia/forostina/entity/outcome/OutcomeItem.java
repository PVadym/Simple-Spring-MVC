package ua.avadamedia.forostina.entity.outcome;

import lombok.Data;
import ua.avadamedia.forostina.entity.consumable.Consumable;
import ua.avadamedia.forostina.entity.employee.Employee;
import ua.avadamedia.forostina.entity.order.ItemStatus;
import ua.avadamedia.forostina.entity.product.Product;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class OutcomeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Consumable consumable;

    private Integer quantity;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double length;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double totalQuantity;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal price;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

}


