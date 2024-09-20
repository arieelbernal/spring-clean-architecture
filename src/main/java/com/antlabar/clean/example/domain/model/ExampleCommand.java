package com.antlabar.clean.example.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExampleCommand {
    private Long id;
    private String description;
    private int quantity;
}
