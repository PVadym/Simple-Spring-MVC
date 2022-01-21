package ua.avadamedia.forostina.entity.customer;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class CustomerVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private String phone;

    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @Enumerated(EnumType.STRING)
    private PriceType priceType;

    @Embedded
    private Delivery delivery;

    @CreationTimestamp
    private LocalDateTime creationDate;
}
