package org.tolga.manager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8090/user" ,decode404 = true,name = "course-user")
public interface IUserManager {


    @PostMapping("/isteacher/{id}")
    public ResponseEntity<Boolean> isTeacher(@PathVariable Long id);



}
