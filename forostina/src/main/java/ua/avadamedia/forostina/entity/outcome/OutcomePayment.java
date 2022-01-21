package ua.avadamedia.forostina.entity.outcome;

import lombok.Data;
import ua.avadamedia.forostina.entity.account.CreditCard;
import ua.avadamedia.forostina.entity.order.PaymentMethod;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class OutcomePayment {

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

    @Column(nullable = false,
            columnDefinition = "boolean default false")
    private boolean supplerDrawer = false;
}
