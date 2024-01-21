package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Entity(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "content")
    @Setter @NonNull private String content;
    @Column(name = "title")
    @Setter @NonNull private String title;
    @Column(name = "image")
    @Setter @NonNull private String image;

    @Column(name = "citation")
    @Setter @NonNull private String citation;
    @OneToMany(fetch = FetchType.LAZY)
    @Setter private List<Product> products;
    @Column(name = "number_purchases")
    @Setter private Integer numberPurchases;
}
