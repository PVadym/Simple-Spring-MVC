package ua.avadamedia.forostina.entity.raw;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RawCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
