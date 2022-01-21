package ua.avadamedia.forostina.entity.income;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class IncomePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    private IncomePaymentMethod paymentMethod;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

    @Column(columnDefinition="TEXT")
    private String comment;

    @Enumerated(EnumType.STRING)
    private Currency currency;

}
