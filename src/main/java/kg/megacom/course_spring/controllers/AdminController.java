package kg.megacom.course_spring.controllers;

import kg.megacom.course_spring.dto.UserDto;
import kg.megacom.course_spring.entities.User;
import kg.megacom.course_spring.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping(value = "user/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(adminService.saveUser(userDto), HttpStatus.OK);
    }

    @GetMapping(value = "user/get")
    public ResponseEntity<?> getUser(){
        return new ResponseEntity<>(adminService.getUser(),HttpStatus.OK);
    }
}
