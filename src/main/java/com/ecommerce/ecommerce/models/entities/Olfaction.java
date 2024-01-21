package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Olfaction {
    @Id @GeneratedValue()
    private Integer id;
    @Column(name = "content") @NonNull
    @Setter private String content;

}
