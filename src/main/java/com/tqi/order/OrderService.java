package com.tqi.order;

import com.tqi.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookService bookService;

    @Transactional
    public OrderEntity save(OrderEntity orderEntity) {
        bookService.addInventory(orderEntity.getBookId(), orderEntity.getAmount());
        return orderRepository.save(orderEntity);
    }

    public OrderEntity findById(UUID id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException(""));
    }

}
