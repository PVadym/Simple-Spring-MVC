package ua.avadamedia.forostina.entity.raw;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Raw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private RawCategory category;

    @Enumerated(EnumType.STRING)
    private RawMeasureUnit measureUnit;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;
}
