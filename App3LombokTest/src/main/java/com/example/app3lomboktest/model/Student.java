package com.example.app3lomboktest.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Student {
    @NonNull
    private String sid;
    private String sname;
}
