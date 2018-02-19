package clbo.students.controller;

import clbo.students.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class CoursesController {

    ArrayList<Course> courses = new ArrayList<>();

    public CoursesController(){
        courses.add(new Course(1, "Asp.NET MVC", new Date("2017/10/11"), 10));
        courses.add(new Course(2, "Javascript", new Date("2017/10/11"), 10));
        courses.add(new Course(3, "Trains", new Date("2017/10/11"), 10));
    }

    @GetMapping("/courses")
    public String index(Model model){

        model.addAttribute("cou", courses);
        return "courses/index";
    }

}
