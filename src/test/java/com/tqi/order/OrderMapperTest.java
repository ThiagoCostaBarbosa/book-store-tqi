package com.tqi.order;

import com.tqi.order.OrderEntity;
import com.tqi.order.OrderMapper;
import com.tqi.order.OrderRequest;
import com.tqi.order.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderMapperTest {

    @Test
    public void testToEntity() {

        OrderRequest request = new OrderRequest();

        request.setName("Name");
        request.setDocument("999.999.999-99");
        request.setBookId(UUID.randomUUID());
        request.setUniteValue(BigDecimal.valueOf(29.90));
        request.setAmount(2020);

        OrderMapper mapper = new OrderMapper();
        OrderEntity entity = mapper.toEntity(request);

        assertEquals(entity.getName(), request.getName());
        assertEquals(entity.getDocument(), request.getDocument());
        assertEquals(entity.getBookId(), request.getBookId());
        assertEquals(entity.getUniteValue(), request.getUniteValue());
        assertEquals(entity.getAmount(), request.getAmount());

    }


    @Test
    public void testToResponse() {

        OrderEntity entity = new OrderEntity(
                UUID.randomUUID(),
                "Name",
                "999.999.999-99",
                UUID.randomUUID(),
                BigDecimal.valueOf(29.90),
                2020
        );

        OrderMapper mapper = new OrderMapper();
        OrderResponse response = mapper.toResponse(entity);

        assertEquals(response.getId(), entity.getId());
        assertEquals(response.getName(), entity.getName());
        assertEquals(response.getDocument(), entity.getDocument());
        assertEquals(response.getBookId(), entity.getBookId());
        assertEquals(response.getUniteValue(), entity.getUniteValue());
        assertEquals(response.getAmount(), entity.getAmount());

    }
}
