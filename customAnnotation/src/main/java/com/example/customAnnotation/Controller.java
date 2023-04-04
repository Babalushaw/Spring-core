package com.example.customAnnotation;

import com.example.customAnnotation.apply.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
    @GetMapping("")
    public ResponseEntity<Object> getPerson(){
        return ResponseEntity.status(HttpStatus.OK).body(new Person().toString());
    }
}
