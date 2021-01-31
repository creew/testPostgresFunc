package com.example.springdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Control {

    private final Repo repo;

    public Control(Repo repo) {
        this.repo = repo;
    }

    @GetMapping("")
    public List<Looser> get() {
        return repo.getLosersBetween(10, 20);

    }
}
