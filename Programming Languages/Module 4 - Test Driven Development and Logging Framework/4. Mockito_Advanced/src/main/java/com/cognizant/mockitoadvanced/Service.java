package com.cognizant.mockitoadvanced;

public class Service {

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String fetchData() {
        return repository.getData();
    }

}