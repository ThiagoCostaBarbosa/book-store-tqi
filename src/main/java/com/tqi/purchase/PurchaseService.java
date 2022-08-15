package com.tqi.purchase;

import com.tqi.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    private final BookService bookService;

    public PurchaseService(BookService bookService) {
        this.bookService = bookService;
    }

    @Transactional
    public PurchaseEntity save(PurchaseEntity purchaseEntity) {
        bookService.addInventory(purchaseEntity.getBookId(), purchaseEntity.getAmount());
        return purchaseRepository.save(purchaseEntity);
    }

    public PurchaseEntity findById(UUID id) {
        return purchaseRepository.findById(id).orElseThrow(() -> new PurchaseNotFoundException(""));
    }

}
