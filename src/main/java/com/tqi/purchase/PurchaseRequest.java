package com.tqi.purchase;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class PurchaseRequest {

    private UUID bookId;
    private BigDecimal uniteValue;
    private Integer amount;
}
