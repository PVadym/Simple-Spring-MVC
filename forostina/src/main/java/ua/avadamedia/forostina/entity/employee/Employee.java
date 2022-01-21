package ua.avadamedia.forostina.entity.employee;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type="org.hibernate.type.MaterializedBlobType")
    private byte [] avatar;

    @ManyToOne
    private Position position;

    private String phone;

    private LocalDate birthdate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, name = "employee_id")
    private List<DocumentData> documents;

    @Column(nullable = false,
            columnDefinition = "boolean default true")
    private boolean active = true;

}
