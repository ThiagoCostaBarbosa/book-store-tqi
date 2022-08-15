package com.tqi.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private BookMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse save(@RequestBody BookRequest bookRequest) {

        BookEntity bookEntity = mapper.toEntity(bookRequest);
        return mapper.toResponse(service.save(bookEntity));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<BookResponse> findAll() {

        return service.findAll()
                .stream()
                .map(bookEntity -> mapper.toResponse(bookEntity))
                .collect(Collectors.toList());
    }
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse findById(@PathVariable UUID id) {
        return mapper.toResponse(service.findById(id));
    }
}