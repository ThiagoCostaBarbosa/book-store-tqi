package com.tqi.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class BookResponse {

    private UUID id;
    private String title;
    private String author;
    private String publisher;
    private String image;
    private Integer publisherDate;
    private Integer inventory;
}
