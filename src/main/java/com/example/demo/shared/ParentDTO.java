package com.example.demo.shared;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ParentDTO {
    private Long id;
    private String name;
    @JsonManagedReference
    private List<ChildDTO> childs;
}
