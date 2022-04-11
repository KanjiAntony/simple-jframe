package oop.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Meal {
    
    private String mealName;
    private MealType mealType;
}
