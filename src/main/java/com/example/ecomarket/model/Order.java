package com.example.ecomarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String address;
    private String referencePoint;
    private String comments;
    private final LocalDateTime date = LocalDateTime.now();
    private int price;
    private int deliveryPrice;
    @OneToOne
    @JoinColumn(name = "orderItem_id")
    private OrderItem orderItem;
}