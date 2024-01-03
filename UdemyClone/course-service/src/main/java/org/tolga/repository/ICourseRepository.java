package org.tolga.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tolga.repository.entity.Course;

@Repository
public interface ICourseRepository extends MongoRepository<Course,String> {
}
