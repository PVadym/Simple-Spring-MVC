package ua.avadamedia.forostina.entity.income;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate incomeDate;

    @ManyToOne
    private Supplier supplier;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "income_id", nullable = false)
    private List<IncomeItem> items;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "income_id", nullable = false)
    private List<IncomePayment> payments;
}
