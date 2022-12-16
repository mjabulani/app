package com.mjabulani.app.resources;

import com.mjabulani.app.models.PaymentRequestV1;
import com.mjabulani.app.models.PaymentResponseV1;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(produces = "application/json")
@Api
public class ApiResourceV1 {


    public boolean Mono<PaymentResponseV1> paymentInitiate(@RequestBody PaymentRequestV1 createPaymentRequestV2) {
    return true;}
}
