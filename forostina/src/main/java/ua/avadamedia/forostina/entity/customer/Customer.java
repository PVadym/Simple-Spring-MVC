package ua.avadamedia.forostina.entity.customer;

import lombok.Data;
import ua.avadamedia.forostina.entity.user.User;

import javax.persistence.*;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

    @ManyToOne
    private User manager;

}
