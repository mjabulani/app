package com.mjabulani.app.interfaces;

import com.mjabulani.app.models.CreatePaymentRequest;
import com.mjabulani.app.models.PaymentResponseV1;
import reactor.core.publisher.Mono;

public interface PaymentInterface {

    Mono<PaymentResponseV1> initiatePayment(CreatePaymentRequest request);
}
