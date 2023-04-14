package com.example.demo.shared;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChildDTO {
    private Long id;
    private String name;
    @JsonBackReference
    private ParentDTO parent;
}
