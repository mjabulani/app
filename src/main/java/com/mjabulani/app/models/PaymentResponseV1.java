package com.mjabulani.app.models;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@ApiModel
@ToString
@NoArgsConstructor
@JsonNaming
@Data
public class PaymentResponseV1 {

    @ApiModelProperty(example = "e3cbb765-4323-4e55-9536-7b3508ec1f5f")
    public String paymentId;

    @ApiModelProperty(example = "21.37")
    public BigDecimal amount;

}
