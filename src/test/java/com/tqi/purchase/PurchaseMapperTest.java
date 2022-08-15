package com.tqi.purchase;

import com.tqi.purchase.PurchaseEntity;
import com.tqi.purchase.PurchaseMapper;
import com.tqi.purchase.PurchaseRequest;
import com.tqi.purchase.PurchaseResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseMapperTest {

    @Test
    public void testToEntity() {

        PurchaseRequest request = new PurchaseRequest();

        request.setBookId(UUID.randomUUID());
        request.setUniteValue(BigDecimal.valueOf(29.90));
        request.setAmount(30);

        PurchaseMapper mapper = new PurchaseMapper();
        PurchaseEntity entity = mapper.toEntity(request);

        assertEquals(entity.getBookId(), request.getBookId());
        assertEquals(entity.getUniteValue(), request.getUniteValue());
        assertEquals(entity.getAmount(), request.getAmount());

    }


    @Test
    public void testToResponse() {

        PurchaseEntity entity = new PurchaseEntity(
                UUID.randomUUID(),
                UUID.randomUUID(),
                BigDecimal.valueOf(29.90),
                30
        );

        PurchaseMapper mapper = new PurchaseMapper();
        PurchaseResponse response = mapper.toResponse(entity);

        assertEquals(response.getId(), entity.getId());
        assertEquals(response.getBookId(), entity.getBookId());
        assertEquals(response.getUniteValue(), entity.getUniteValue());
        assertEquals(response.getAmount(), entity.getAmount());

    }
}
