package com.antlabar.clean.example.infrastructure.repository;

import com.antlabar.clean.example.domain.model.ExampleCommand;
import com.antlabar.clean.example.domain.repository.ExampleCommandRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.Optional;

public class ExampleCommandJpaRepository implements ExampleCommandRepository{

    private final JpaRepository<ExampleCommand, Long> jpaRepository;

    public ExampleCommandJpaRepository(JpaRepository<ExampleCommand, Long> jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<ExampleCommand> createExample(ExampleCommand example) {
        return Optional.of(jpaRepository.save(example));
    }

    @Override
    public Optional<ExampleCommand> updateExample(int id,ExampleCommand example) {
        return Optional.of(jpaRepository.save(example));
    }

    @Override
    public void deleteExample(int id) {
        jpaRepository.deleteById((long) id);
    }
}
