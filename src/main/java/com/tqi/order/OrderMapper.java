package com.tqi.order;

import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderEntity toEntity(OrderRequest orderRequest) {
        return OrderEntity.builder()
                .name(orderRequest.getName())
                .document(orderRequest.getDocument())
                .bookId(orderRequest.getBookId())
                .uniteValue(orderRequest.getUniteValue())
                .amount(orderRequest.getAmount())
                .build();
    }

    public OrderResponse toResponse(OrderEntity orderEntity) {
        return OrderResponse.builder()
                .id(orderEntity.getId())
                .name(orderEntity.getName())
                .document(orderEntity.getDocument())
                .bookId(orderEntity.getBookId())
                .uniteValue(orderEntity.getUniteValue())
                .amount(orderEntity.getAmount())
                .build();
    }
}
