package oop.model;

import java.time.LocalDate;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Bill {
    
    private CustomerInfo customer;
    private double paymentID;
    private LocalDate paymentDate;
    private double totalPrice;
    private OnlinePayment onlinePayment;
    private CashOnDelivery cashOnDelivery;
    private Item itemBought;
    
}
