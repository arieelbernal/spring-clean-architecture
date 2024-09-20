package com.antlabar.clean.example.domain.repository;

import com.antlabar.clean.example.domain.model.ExampleCommand;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public interface ExampleCommandRepository {
    Optional<ExampleCommand> createExample(ExampleCommand example);
    Optional<ExampleCommand> updateExample(int id, ExampleCommand example);
    void deleteExample(int id);
}
