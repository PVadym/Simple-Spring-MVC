package ua.avadamedia.forostina.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class CreditCardForm {
    @NotNull
    @Pattern(regexp = "^(\\d{12})$")
    private String number;

    @NotNull
    @Size(min = 5, max = 40)
    private String holder;

    private boolean active;
}
