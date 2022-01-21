package ua.avadamedia.forostina.entity.account;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class CashOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime creationDate;

    @Enumerated(EnumType.STRING)
    private CashOperationType operationType;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name ="id", column = @Column(name = "purpose_id")),
            @AttributeOverride(name ="type", column = @Column(name ="purpose_type"))})
    private PaymentPurpose purpose;

    @Column(precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2)")
    private BigDecimal value;

}
