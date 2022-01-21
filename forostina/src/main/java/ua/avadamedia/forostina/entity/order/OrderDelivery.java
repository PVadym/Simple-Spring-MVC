package ua.avadamedia.forostina.entity.order;

import lombok.Data;
import ua.avadamedia.forostina.entity.order.Carrier;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class OrderDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String recipientName;
    @Column(nullable = false)
    private String recipientPhone;

    @Enumerated(EnumType.STRING)
    private Carrier carrier;

    private String address;

    private String city;

    private String department;

    private String deliveryNumber;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal insurance;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal podValue;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private Double wight;

    @Column(nullable = false,
            columnDefinition = "boolean default false")
    private boolean pod;

    @Column(nullable = false)
    private String senderName;

    @Column(nullable = false)
    private String senderPhone;

}
