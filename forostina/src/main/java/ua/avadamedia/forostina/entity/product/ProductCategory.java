package ua.avadamedia.forostina.entity.product;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
