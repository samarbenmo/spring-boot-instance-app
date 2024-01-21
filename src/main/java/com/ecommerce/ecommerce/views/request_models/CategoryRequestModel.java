package com.ecommerce.ecommerce.views.request_models;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestModel {
    @NonNull private String content;
    @NonNull private String title;
    @NonNull private MultipartFile image;
    @NonNull private String citation;
}
