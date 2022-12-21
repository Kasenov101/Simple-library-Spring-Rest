package com.kasenov.libpro.simplelibrary.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Book> books;

    @Column(name = "date_of_receiving")
    private Date dateOfReceiving;

    @Column(name = "return_date")
    private Date returnDate;
}