package ua.avadamedia.forostina.entity.account;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String holder;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

}
