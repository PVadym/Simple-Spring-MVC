package ua.avadamedia.forostina.entity.employee;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
