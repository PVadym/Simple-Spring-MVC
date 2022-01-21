package ua.avadamedia.forostina.entity.order;

import lombok.Data;
import ua.avadamedia.forostina.entity.customer.CustomerVersion;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate orderDate;

    private LocalDate shipDate;

    @ManyToOne
    private CustomerVersion customerVersion;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "order_id", nullable = false)
    private List<OrderItem> items;

    @Column(columnDefinition="TEXT")
    private String comment;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private OrderDelivery orderDelivery;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "order_id", nullable = false)
    private List<OrderPayment> payments;
}
