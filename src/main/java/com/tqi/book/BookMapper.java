package com.tqi.book;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public static final int INVENTORY_START = 0;

    public BookEntity toEntity(BookRequest bookRequest) {
        return BookEntity.builder()
                .title(bookRequest.getTitle())
                .author(bookRequest.getAuthor())
                .publisher(bookRequest.getPublisher())
                .image(bookRequest.getImage())
                .publisherDate(bookRequest.getPublisherDate())
                .inventory(INVENTORY_START)
                .build();
    }

    public BookResponse toResponse(BookEntity bookEntity) {
        return BookResponse.builder()
                .id(bookEntity.getId())
                .title(bookEntity.getTitle())
                .author(bookEntity.getAuthor())
                .publisher(bookEntity.getPublisher())
                .image(bookEntity.getImage())
                .publisherDate(bookEntity.getPublisherDate())
                .inventory(bookEntity.getInventory())
                .build();
    }
}
