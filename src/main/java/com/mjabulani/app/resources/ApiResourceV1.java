package com.mjabulani.app.resources;

import com.mjabulani.app.models.PaymentRequestV1;
import com.mjabulani.app.models.PaymentResponseV1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Api
@RestController
@RequiredArgsConstructor
@RequestMapping(produces = "application/json")

public class ApiResourceV1 {


    public Mono<PaymentResponseV1> paymentInitiate(@RequestBody PaymentRequestV1) {
        PaymentResponseV1 response = "asd";
    }
}
