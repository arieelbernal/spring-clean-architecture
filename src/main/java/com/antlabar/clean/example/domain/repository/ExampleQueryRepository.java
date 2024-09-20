package com.antlabar.clean.example.domain.repository;

import com.antlabar.clean.example.domain.model.ExampleQuery;

import java.util.List;
import java.util.Optional;

public interface ExampleQueryRepository {
    Optional<ExampleQuery> findById(int id);
    List<ExampleQuery> findAllExamples();
}
