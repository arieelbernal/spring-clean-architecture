package com.antlabar.clean.example.infrastructure.repository;

import com.antlabar.clean.example.domain.model.ExampleQuery;
import com.antlabar.clean.example.domain.repository.ExampleQueryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ExampleQueryJpaRepository implements ExampleQueryRepository {

    private final JpaRepository<ExampleQuery, Long> jpaRepository;

    public ExampleQueryJpaRepository(JpaRepository<ExampleQuery, Long> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<ExampleQuery> findById(int id) {
        return jpaRepository.findById((long) id);
    }

    @Override
    public List<ExampleQuery> findAllExamples() {
        return jpaRepository.findAll();
    }
}
