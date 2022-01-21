package ua.avadamedia.forostina.entity.employee;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@Entity
public class DocumentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Type(type="org.hibernate.type.MaterializedBlobType")
    private byte [] data;

}
