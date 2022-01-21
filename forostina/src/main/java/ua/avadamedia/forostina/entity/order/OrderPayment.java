package ua.avadamedia.forostina.entity.order;

import lombok.Data;
import ua.avadamedia.forostina.entity.account.CreditCard;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class OrderPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

    @ManyToOne
    private CreditCard creditCard;
}
