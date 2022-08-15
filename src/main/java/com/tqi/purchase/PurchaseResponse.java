package com.tqi.purchase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class PurchaseResponse {

    private UUID id;
    private UUID bookId;
    private BigDecimal uniteValue;
    private Integer amount;
}
