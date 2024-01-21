package com.ecommerce.ecommerce.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Entity(name = "commands")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Command {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @Setter @NonNull private CustomerProfile clientProfile;
    @OneToMany
    @Setter private List<CommandLine> commandLines;
    @Column(name = "invoice") @NonNull
    @Setter private String invoice;
}
