package com.ecommerce.ecommerce.views;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class RequestObject<T> {
    @NonNull private T instance;
    private HashMap<String, MultipartFile> files;
}
