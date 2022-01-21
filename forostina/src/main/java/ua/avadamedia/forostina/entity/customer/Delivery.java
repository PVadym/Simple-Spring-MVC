package ua.avadamedia.forostina.entity.customer;

import ua.avadamedia.forostina.entity.order.Carrier;

import javax.persistence.*;

@Embeddable
public class Delivery {

    @Enumerated(EnumType.STRING)
    private Carrier carrier;

    private String city;

    private String department;

}
