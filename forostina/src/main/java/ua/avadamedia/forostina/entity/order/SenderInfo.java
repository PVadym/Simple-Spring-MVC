package ua.avadamedia.forostina.entity.order;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SenderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String phone;
}
