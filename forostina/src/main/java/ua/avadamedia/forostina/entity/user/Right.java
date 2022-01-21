package ua.avadamedia.forostina.entity.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rights")
public class Right {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

}
