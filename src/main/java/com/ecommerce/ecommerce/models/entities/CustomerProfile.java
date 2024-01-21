package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Getter
@Entity(name = "client_profiles")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerProfile {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "firstname") @NonNull
    @Setter
    private String  firstname;
    @Column(name = "lastname") @NonNull
    @Setter
    private String lastname;
    @Column(name = "phone") @NonNull
    @Setter
    private String phone;
    @OneToMany
    @Setter
    private List<Command> commands;
    @Column(name = "date_joined")
    @Setter
    private Date dateJoined;
    @Column(name = "number_purchases")
    @Setter
    private Integer numberPurchases;
    @Column(name = "total_sales") @Setter
    private Float totalSales;
}
