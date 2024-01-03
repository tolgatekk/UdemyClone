package org.tolga.service;

import org.tolga.dto.request.NewCourseCreateRequestDto;
import org.tolga.manager.IUserManager;
import org.tolga.mapper.ICourseMapper;
import org.tolga.repository.ICourseRepository;
import org.tolga.repository.entity.Course;
import org.tolga.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends ServiceManager<Course,String> {


    private final ICourseRepository courseRepository;
    private final IUserManager userManager;

    public CourseService(ICourseRepository courseRepository, IUserManager userManager) {
        super(courseRepository);
        this.courseRepository = courseRepository;
        this.userManager = userManager;
    }

    public Course create(NewCourseCreateRequestDto dto) {
        Course course= ICourseMapper.INSTANCE.toCourse(dto);

        boolean kontrol= userManager.isTeacher(dto.getInstructorId()).getBody();

        if (kontrol){
            return save(course);
        }else{
            throw  new RuntimeException("Yetkisiz kullanıcı");

        }


    }
}
