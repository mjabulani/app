package com.mjabulani.app.resources;

import com.mjabulani.app.mappers.CreatePaymentRequestMapper;
import com.mjabulani.app.models.CreatePaymentRequest;
import com.mjabulani.app.models.PaymentRequestV1;
import com.mjabulani.app.models.PaymentResponseV1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(produces = "application/json")
public class ApiResourceV1 {

    CreatePaymentRequestMapper createPaymentRequestMapper;

    @PostMapping(path = "/init")
    public Mono<PaymentResponseV1> paymentInitiate(@RequestBody PaymentRequestV1 paymentRequestV1) {
        CreatePaymentRequest paymentRequest = createPaymentRequestMapper.mapPaymentRequest(paymentRequestV1);
        return null;
    }

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hello";
    }
}
