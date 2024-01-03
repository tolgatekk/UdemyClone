package org.tolga.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document
public class Course extends BaseEntity{
     @Id
    private String  id;
     private String title;
     private String description;

     private Double price;
     private Long  instructorId;// user serviceden gelen ogretmen idsi

    private List<Long> students;// user serviceden gelen ogrenci idleri

    private List<String> lessons;// lesson microservisinden gelen idler(lesson microservisinde mongodb kullanılmaktadır )



}
