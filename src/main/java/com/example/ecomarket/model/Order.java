package com.example.ecomarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
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
    @OneToMany(mappedBy = "orders")
    private List<OrderItem> orderItems;
    @ManyToOne
    @JoinColumn(name = "basket_id")
    private Basket basket;
}