package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.*;

import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CommandLine {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @Setter @NonNull private Product product;
    @Column(name = "number_items") @NonNull
    @Setter private Integer numberItems;
    @Column(name = "total") @NonNull
    @Setter private Float total;
}
