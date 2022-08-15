package com.tqi.book;

import com.tqi.book.BookEntity;
import com.tqi.book.BookMapper;
import com.tqi.book.BookRequest;
import com.tqi.book.BookResponse;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookMapperTest {

    @Test
    public void testToEntity() {

        BookRequest request = new BookRequest();

        request.setTitle("Title");
        request.setAuthor("Author");
        request.setPublisher("Publisher");
        request.setImage("Image");
        request.setPublisherDate(2020);

        BookMapper mapper = new BookMapper();
        BookEntity entity = mapper.toEntity(request);

        assertEquals(entity.getTitle(), request.getTitle());
        assertEquals(entity.getAuthor(), request.getAuthor());
        assertEquals(entity.getPublisher(), request.getPublisher());
        assertEquals(entity.getImage(), request.getImage());
        assertEquals(entity.getPublisherDate(), request.getPublisherDate());

    }

    @Test
    public void testToResponse() {

        BookEntity entity = new BookEntity();

        entity.setId(UUID.randomUUID());
        entity.setTitle("Title");
        entity.setAuthor("Author");
        entity.setPublisher("Publisher");
        entity.setImage("Image");
        entity.setPublisherDate(2020);
        entity.setInventory(105);

        BookMapper mapper = new BookMapper();
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
