package ua.avadamedia.forostina.entity.outcome;

import lombok.Data;
import ua.avadamedia.forostina.entity.customer.CustomerVersion;
import ua.avadamedia.forostina.entity.order.OrderItem;
import ua.avadamedia.forostina.entity.order.OrderPayment;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Outcome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate outcomeDate;

    @ManyToOne
    private CustomerVersion customerVersion;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "outcome_id", nullable = false)
    private List<OutcomeItem> items;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "outcome_id", nullable = false)
    private List<OutcomePayment> payments;

}
