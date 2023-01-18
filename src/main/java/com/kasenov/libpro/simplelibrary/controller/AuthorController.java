package com.kasenov.libpro.simplelibrary.controller;

import com.kasenov.libpro.simplelibrary.dto.Author;
import com.kasenov.libpro.simplelibrary.model.AuthorEntity;
import com.kasenov.libpro.simplelibrary.repository.AuthorRepository;
import com.kasenov.libpro.simplelibrary.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authors")
public class AuthorController extends AbstractController<AuthorEntity, AuthorRepository,
        AuthorService, Author>{

    public AuthorController(AuthorService service, Author dto, AuthorEntity entity) {
        super(service, dto, entity);
    }
}
