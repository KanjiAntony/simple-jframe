package oop.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerInfo {
    
    private String name;
    private int phoneNo;
    private String address;
    private String email;
    private Gender gender;
    
}
