package com.mjabulani.app.models;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@NoArgsConstructor
@JsonNaming
@Data
public class PaymentRequestV1 {

    @ApiModelProperty(example = "c12c19f3-19d9-437a-bf19-e1f2a854f13d")
    public String externalId;

    @ApiModelProperty(example = "35.32")
    public BigDecimal amount;

    @ApiModelProperty(example = "Marek Jabulani - Creditor")
    public String creditorName;

    @ApiModelProperty(example = "Jurand ze spychowa - Debtor")
    public String debtorName;

    @ApiModelProperty(example = "Money for nothing")
    public String title;

    @ApiModelProperty(example = "PL61109010140000071219812874")
    public String creditorIban;

    @ApiModelProperty(example = "PL61109010140000071219812874")
    public String debtorIban;

}
