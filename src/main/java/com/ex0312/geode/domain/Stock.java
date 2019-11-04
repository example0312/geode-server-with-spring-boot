package com.ex0312.geode.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Region("stock")
public class Stock {
    @Id
    private Long id;
    private double price;
    private String name;
}
