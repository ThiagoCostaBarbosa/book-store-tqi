package com.tqi.book;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookEntity save(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @SneakyThrows
    public BookEntity addInventory(UUID id, Integer amount) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(""));

        bookEntity.addInventory(amount);

        return save(bookEntity);
    }

    @SneakyThrows
    public BookEntity decreaseInventory(UUID id, Integer amount) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(""));

        bookEntity.decreaseInventory(amount);

        return save(bookEntity);
    }

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    public BookEntity findById(UUID id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(""));
        return bookEntity;
    }
}