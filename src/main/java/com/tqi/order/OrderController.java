package com.tqi.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @Autowired
    private OrderMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse save(@RequestBody OrderRequest orderRequest) {

        OrderEntity orderEntity = mapper.toEntity(orderRequest);
        return mapper.toResponse(service.save(orderEntity));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse findById(@PathVariable UUID id) {
        return mapper.toResponse(service.findById(id));
    }

}
