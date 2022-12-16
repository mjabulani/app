package com.mjabulani.app.mappers;

import com.mjabulani.app.models.CreatePaymentRequest;
import com.mjabulani.app.models.PaymentRequestV1;
import org.springframework.stereotype.Component;

@Component
public class CreatePaymentRequestMapper {

    public CreatePaymentRequest mapPaymentRequest(PaymentRequestV1 requestV1) {
        return CreatePaymentRequest.builder()
                .amount(requestV1.amount)
                .creditorIban(requestV1.creditorIban)
                .debtorIban(requestV1.debtorIban)
                .debtorName(requestV1.debtorName)
                .creditorName(requestV1.creditorName)
                .title(requestV1.title)
                .externalId(requestV1.externalId)
                .build();


    }

}

