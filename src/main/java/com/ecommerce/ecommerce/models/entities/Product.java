package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Entity(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "title") @NonNull
    @Setter private String title;
    @Column(name = "code") @NonNull
    @Setter
    private String code;
    @Column(name = "description") @NonNull
    @Setter private String description;
    @Column(name = "image") @NonNull
    @Setter private String image;
    @Column(name = "price") @NonNull
    @Setter Float price;
    @Column(name = "current_quantity") @NonNull
    @Setter Integer currentQuantity = 1;
    @ManyToOne() @NonNull
    @Setter private Category category;
    @OneToMany(fetch = FetchType.LAZY)
    @Setter private List<Olfaction> olfactions;
    @Column(name = "number_purchases")
    @Setter private Integer numberPurchases = 0;
}
