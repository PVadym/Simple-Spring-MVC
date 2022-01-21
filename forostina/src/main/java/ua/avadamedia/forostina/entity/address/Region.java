package ua.avadamedia.forostina.entity.address;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
