package com.tqi.book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class BookRequest {

    private String title;
    private String author;
    private String publisher;
    private String image;
    private Integer publisherDate;
}
