package ua.avadamedia.forostina.entity.order;

import lombok.Getter;

@Getter
public enum  PaymentMethod {

    ADVANCE_CASH(true, false),
    ADVANCE_CARD(true, true),
    ADVANCE_VAT(true, false),
    ADVANCE_PE(true, false),

    PAY_CASH(false, false),
    PAY_CARD(false, true),
    PAY_VAT(false, false),
    PAY_PE(false, false),

    PAY_CUSTOMER_DRAWER(false, false);

    private final boolean advance;
    private final boolean card;

    PaymentMethod(boolean advance, boolean card) {
        this.advance = advance;
        this.card = card;
    }
}
