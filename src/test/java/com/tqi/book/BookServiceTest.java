package com.tqi.book;


import com.tqi.Utils.Utils;
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

        BookRequest request = Utils.createBookRequest();
        BookEntity entity = Utils.createBookEntity();

        when(bookRepository.save(any())).thenReturn(entity);

        BookResponse response = mapper.toResponse(bookService.save(mapper.toEntity(request)));

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

        BookEntity entity = Utils.createBookEntity();

        when(bookRepository.findById(any())).thenReturn(Optional.of(entity));

        BookResponse retrieve  = mapper.toResponse(bookService.findById(entity.getId()));

        verify(bookRepository, times(1)).findById(any());

        assertEquals(retrieve.getId(), entity.getId());
        assertEquals(retrieve.getTitle(), entity.getTitle());
        assertEquals(retrieve.getAuthor(), entity.getAuthor());
        assertEquals(retrieve.getPublisher(), entity.getPublisher());
        assertEquals(retrieve.getPublisherDate(), entity.getPublisherDate());
        assertEquals(retrieve.getImage(), entity.getImage());

    }

}
