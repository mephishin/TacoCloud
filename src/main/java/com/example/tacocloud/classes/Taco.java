package com.example.tacocloud.classes;

import lombok.Data;
import java.util.List;

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredients;
}
