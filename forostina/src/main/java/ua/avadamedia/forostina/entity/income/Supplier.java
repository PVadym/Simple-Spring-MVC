package ua.avadamedia.forostina.entity.income;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String phone;

    private String address;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;
}
