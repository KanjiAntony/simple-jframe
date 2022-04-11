package oop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import oop.model.*;

public class OrderService {
    
    public Bill orderMeal(
            String mealName, MealType mealType, double mealPrice,
             String customerName, int customerPhone, String customerEmail,Gender customerGender,String customerAddress,
             String customerBank, String customerVisa,double cashOnDelivery
            ) 
    {
        
        Meal first_meal = new Meal(mealName,mealType);
        
        ArrayList<Meal> first_meal_list = new ArrayList<Meal>(
                Arrays.asList(
                        first_meal
                )
        );
        
        Item first_item = new Item();
        first_item.setPrice(mealPrice);
        first_item.setMeal(first_meal_list);
        
        CustomerInfo first_customer = new CustomerInfo();
        first_customer.setName(customerName);
        first_customer.setPhoneNo(customerPhone);
        first_customer.setEmail(customerEmail);
        first_customer.setGender(customerGender);
        first_customer.setAddress(customerAddress);
        
        OnlinePayment first_payment = new OnlinePayment(customerBank,customerVisa);
        
        CashOnDelivery con_delivery = new CashOnDelivery(cashOnDelivery);
        
        Bill customer_bill = new Bill();
        customer_bill.setCustomer(first_customer);
        customer_bill.setPaymentDate(LocalDate.now());
        customer_bill.setTotalPrice(first_item.getPrice());
        customer_bill.setOnlinePayment(first_payment);
        customer_bill.setCashOnDelivery(con_delivery);
        customer_bill.setPaymentID(Math.random());
        customer_bill.setItemBought(first_item);
        
        return customer_bill;
        
    }
    
}
