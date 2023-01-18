package com.kasenov.libpro.simplelibrary.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Component
public class Warehouse extends AbstractDto {

    @NotNull(message = "You have not chosen a book")
    @JsonBackReference
    private Book book;
    @NotNull(message = "quantity must not be null")
    private int quantity;
}