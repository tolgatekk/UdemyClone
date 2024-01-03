package org.tolga.controller;

import org.tolga.dto.request.NewCourseCreateRequestDto;
import org.tolga.repository.entity.Course;
import org.tolga.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {


    private  final CourseService courseService;


    @PostMapping("/create")
    public ResponseEntity<Course> create(@RequestBody NewCourseCreateRequestDto dto){
        return ResponseEntity.ok(courseService.create(dto));

    }


    @GetMapping("/findall")
    public  ResponseEntity<List<Course>> findAll(){
        return  ResponseEntity.ok(courseService.findAll());
    }

}
