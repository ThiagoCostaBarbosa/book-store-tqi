package com.tqi.book;


import com.tqi.book.BookEntity;
import com.tqi.book.BookRequest;
import com.tqi.book.BookResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookUtils {

    public static BookRequest createBookRequest() {
        return BookRequest.builder()
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build();
    }

    public static BookRequest createSuccessBookRequest() {
        return BookRequest.builder()
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build();
    }

    public static BookResponse createBookResponse() {
        return BookResponse.builder()
                .id(UUID.fromString("21836e01-7eb5-4093-8770-34ab55d52580"))
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build();
    }

    public static BookEntity createBookEntityFromMapper() {
        return BookEntity.builder()
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build();
    }

    public static BookEntity createBookEntity() {
        return BookEntity.builder()
                .id(UUID.fromString("21836e01-7eb5-4093-8770-34ab55d52580"))
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build();
    }

    public static List<BookEntity> createBookEntityList() {
        List<BookEntity> books = new ArrayList<>();
        books.add(BookEntity.builder()
                .id(UUID.fromString("21836e01-7eb5-4093-8770-34ab55d52580"))
                .title("The Lion, The Witch, And The Wardrobe")
                .author("CS Lewis")
                .publisher("Geoffrey Bles")
                .publisherDate(1950)
                .image("Image")
                .build());

        books.add(BookEntity.builder()
                .id(UUID.fromString("2E126BBC-FC6E-4382-B816-C3EC730FDBE1"))
                .title("1984")
                .author("George Orwell")
                .publisher("Ulisseia")
                .publisherDate(1949)
                .image("Image2")
                .build());

        return books;
    }
}
