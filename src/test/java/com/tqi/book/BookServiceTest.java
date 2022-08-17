package com.tqi.book;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    private BookMapper mapper = new BookMapper();

    @Test
    void shouldCreateBookWhenBookRequestIsValid() {
        BookEntity request = BookUtils.createBookEntity();

        when(bookRepository.save(any())).thenReturn(request);

        BookEntity response = bookService.save(request);

        verify(bookRepository, times(1)).save(any());

        assertEquals(request.getTitle(), response.getTitle());
        assertEquals(request.getAuthor(), response.getAuthor());
        assertEquals(request.getPublisher(), response.getPublisher());
        assertEquals(request.getPublisherDate(), response.getPublisherDate());
        assertEquals(request.getImage(), response.getImage());
        assertNotNull(response.getId());
    }


    @Test
    void shouldReturnBookResponseWhenBookEntityExists() {

        BookEntity entity = BookUtils.createBookEntity();

        when(bookRepository.findById(any())).thenReturn(Optional.of(entity));

        BookEntity response  = bookService.findById(entity.getId());

        verify(bookRepository, times(1)).findById(any());

        assertEquals(response.getId(), entity.getId());
        assertEquals(response.getTitle(), entity.getTitle());
        assertEquals(response.getAuthor(), entity.getAuthor());
        assertEquals(response.getPublisher(), entity.getPublisher());
        assertEquals(response.getPublisherDate(), entity.getPublisherDate());
        assertEquals(response.getImage(), entity.getImage());

    }

}
