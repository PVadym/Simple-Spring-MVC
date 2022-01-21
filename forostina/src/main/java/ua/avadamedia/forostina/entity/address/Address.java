package ua.avadamedia.forostina.entity.address;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private City city;

    @Column(nullable = false)
    private String location;


}
