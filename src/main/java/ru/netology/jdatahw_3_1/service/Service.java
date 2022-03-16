package ru.netology.jdatahw_3_1.service;

import ru.netology.jdatahw_3_1.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String getProduct(String name) {
        return repository.getProduct(name);
    }
}