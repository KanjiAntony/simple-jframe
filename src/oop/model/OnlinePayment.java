package oop.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OnlinePayment {
    
    private String bankName;
    private String visaNumber;
    
}
