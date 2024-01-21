package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "username") @NonNull
    @Setter private String username;
    @Column(name = "email") @NonNull
    @Setter private String email;
    @OneToOne
    @Setter private CustomerProfile client;
}
