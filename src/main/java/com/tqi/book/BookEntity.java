package com.tqi.book;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;



@Entity(name = "books")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String author;
    private String publisher;
    private String image;
    private Integer publisherDate;
    private Integer inventory;

    public void addInventory(Integer amount){
        inventory += amount;
    }

    public void decreaseInventory(Integer amount) {
        inventory -= amount;
    }
}
