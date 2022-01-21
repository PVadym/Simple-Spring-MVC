package ua.avadamedia.forostina.entity.user;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type="org.hibernate.type.MaterializedBlobType")
    private byte [] avatar;

    @Column(unique = true, nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;

    private LocalDate birthdate;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany
    private List<Right> rights;
}
