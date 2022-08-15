package com.tqi.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService service;

    @Autowired
    private PurchaseMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseResponse save(@RequestBody PurchaseRequest purchaseRequest) {
        PurchaseEntity purchaseEntity = mapper.toEntity(purchaseRequest);
        return mapper.toResponse(service.save(purchaseEntity));
    }


    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseResponse findById(@PathVariable UUID id) {
        return mapper.toResponse(service.findById(id));
    }
}