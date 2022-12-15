package com.mjabulani.app.models;

import lombok.*;
import java.math.BigDecimal;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreatePaymentRequest {
    String externalId;
    BigDecimal amount;
    String creditorName;
    String debtorName;
    String title;
    String creditorIban;
    String debtorIban;

}
