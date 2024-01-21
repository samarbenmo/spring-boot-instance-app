package com.ecommerce.ecommerce.views.request_models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestModel {
    @NonNull private String title;
    @NonNull private String code;
    @NonNull private String description;
    @NonNull private String image;
    @NonNull Float price;
    @NonNull private Integer currentQuantity;
    @NonNull private Object category;
}
