package com.tqi.order;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class OrderRequest {

    private String name;
    private String document;
    private UUID bookId;
    private BigDecimal uniteValue;
    private Integer amount;
}
