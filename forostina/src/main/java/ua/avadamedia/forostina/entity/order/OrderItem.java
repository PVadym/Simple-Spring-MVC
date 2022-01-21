package ua.avadamedia.forostina.entity.order;

import lombok.Data;
import ua.avadamedia.forostina.entity.product.Product;
import ua.avadamedia.forostina.entity.employee.Employee;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    private Integer quantity;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double length;

    @Column(precision = 10, scale = 3, columnDefinition = "NUMERIC(10,3)")
    private Double totalQuantity;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal price;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

    private Integer bend;

    @ManyToOne
    private Employee employee;




}


