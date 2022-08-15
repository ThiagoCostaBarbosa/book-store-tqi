package com.tqi.purchase;

import org.springframework.stereotype.Component;

@Component
public class PurchaseMapper {

    public PurchaseEntity toEntity(PurchaseRequest purchaseRequest) {
        return PurchaseEntity.builder()
                .bookId(purchaseRequest.getBookId())
                .uniteValue(purchaseRequest.getUniteValue())
                .amount(purchaseRequest.getAmount())
                .build();
    }

    public PurchaseResponse toResponse(PurchaseEntity purchaseEntity) {
        return PurchaseResponse.builder()
                .id(purchaseEntity.getId())
                .bookId(purchaseEntity.getBookId())
                .uniteValue(purchaseEntity.getUniteValue())
                .amount(purchaseEntity.getAmount())
                .build();
    }
}
