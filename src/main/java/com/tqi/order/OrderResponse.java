package com.tqi.order;

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
public class OrderResponse {

    private UUID id;
    private String name;
    private String document;
    private UUID bookId;
    private BigDecimal uniteValue;
    private Integer amount;
}
