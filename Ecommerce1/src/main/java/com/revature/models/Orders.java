package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="orders")
@Component

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Orders {

    @Id //This will make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK serial
    private int ordersId;

    @Column(nullable = false)
    private String orderItems;
    @Column(nullable = false, precision = 4, scale = 2)
    private double orderTotal;

    //FK relationship that shows many accounts to 1 user
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")

    private Users users;

    public Orders(String orderItems, double orderTotal, Users users) {
        this.orderItems = orderItems;
        this.orderTotal = orderTotal;
        this.users = users;
    }

    public Orders(String orderItems, double orderTotal) {
        this.orderItems = orderItems;
        this.orderTotal = orderTotal;
    }


}
