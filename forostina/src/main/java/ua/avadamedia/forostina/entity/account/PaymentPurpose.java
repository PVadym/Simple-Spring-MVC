package ua.avadamedia.forostina.entity.account;

import javax.persistence.Embeddable;

@Embeddable
public class PaymentPurpose {
    private Long id;
    private PurposeType type;
}
