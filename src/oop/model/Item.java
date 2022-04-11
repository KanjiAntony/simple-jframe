package oop.model;

import java.util.ArrayList;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Item {
    
    private double price;
    private ArrayList<Meal> meal;
    
}
