package com.dhruv.week7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student getStudent() {
        Student s = new Student();
        s.setStudentId(24);
        s.setFname("Dhruv");
        s.setLname("Modi");
        s.setPhone("165-879-6544");
        s.setDob("2000-04-24");
        s.setStreet("Toronto");
        s.setCity("Toronto");
        s.setNumber("4654");

        return s;
    }
}
