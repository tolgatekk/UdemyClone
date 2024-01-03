package org.tolga.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewCourseCreateRequestDto {
    private String title;
    private String description;
    private Double price;
    private Long  instructorId;
}
