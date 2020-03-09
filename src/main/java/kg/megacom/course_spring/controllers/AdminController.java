package kg.megacom.course_spring.controllers;

import kg.megacom.course_spring.dto.UserDto;
import kg.megacom.course_spring.entities.*;
import kg.megacom.course_spring.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/user/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(adminService.saveUser(userDto),HttpStatus.OK);
    }
    @GetMapping(value = "/user/get")
    public ResponseEntity<?> getUser(){
        return new ResponseEntity<>(adminService.getUser(),HttpStatus.OK);
    }

    @PostMapping(value = "/teacher/save")
    public ResponseEntity<?> saveTeacher(@RequestBody Teacher teacher){
        return new ResponseEntity<>(adminService.saveTeacher(teacher),HttpStatus.OK);
    }
    @GetMapping(value = "/teacher/get")
    public ResponseEntity<?> getTeacher(){
        return new ResponseEntity<>(adminService.getTeacher(),HttpStatus.OK);
    }

    @PostMapping(value = "/student/save")
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>(adminService.saveStudent(student),HttpStatus.OK);
    }
    @GetMapping(value = "/student/get")
    public ResponseEntity<?> getStudent(){
        return new ResponseEntity<>(adminService.getStudent(),HttpStatus.OK);
    }

//    @PostMapping(value = "/role/save")
//    public ResponseEntity<?> saveRole(@RequestBody Role role){
//        return new ResponseEntity<>(adminService.saveRole(role),HttpStatus.OK);
//    }
    @GetMapping(value = "/role/get")
    public ResponseEntity<?> getRole(){
        return new ResponseEntity<>(adminService.getRole(),HttpStatus.OK);
    }

    @PostMapping(value = "/course/save")
    public ResponseEntity<?> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(adminService.saveCourse(course),HttpStatus.OK);
    }
    @GetMapping(value = "/course/get")
    public ResponseEntity<?> getCourse(){
        return new ResponseEntity<>(adminService.getCourse(),HttpStatus.OK);
    }
}
