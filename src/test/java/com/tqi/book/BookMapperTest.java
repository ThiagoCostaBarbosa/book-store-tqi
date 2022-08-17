package com.tqi.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookMapperTest {

    private BookMapper mapper = new BookMapper();

    @Test
    public void testToEntity() {

        BookRequest request = BookUtils.createBookRequest();
        BookEntity entity = mapper.toEntity(request);
        BookEntity expectedEntity = BookUtils.createBookEntityFromMapper();

        assertEquals(entity.getTitle(), expectedEntity.getTitle());
        assertEquals(entity.getAuthor(), expectedEntity.getAuthor());
        assertEquals(entity.getPublisher(), expectedEntity.getPublisher());
        assertEquals(entity.getImage(), expectedEntity.getImage());
        assertEquals(entity.getPublisherDate(), expectedEntity.getPublisherDate());

    }

    @Test
    public void testToResponse() {

        BookEntity entity = BookUtils.createBookEntity();
        BookResponse response = mapper.toResponse(entity);

        assertEquals(response.getId(), entity.getId());
        assertEquals(response.getTitle(), entity.getTitle());
        assertEquals(response.getAuthor(), entity.getAuthor());
        assertEquals(response.getPublisher(), entity.getPublisher());
        assertEquals(response.getImage(), entity.getImage());
        assertEquals(response.getPublisherDate(), entity.getPublisherDate());
        assertEquals(response.getInventory(), entity.getInventory());

    }

}
