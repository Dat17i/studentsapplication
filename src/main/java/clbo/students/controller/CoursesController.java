package clbo.students.controller;

import clbo.students.model.Course;
import clbo.students.repositories.CourseRepository;
import clbo.students.repositories.ICourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class CoursesController {

    private final ICourseRepository courses;

    // ArrayList<Course> courses = new ArrayList<>();

    public CoursesController(){

        courses = new CourseRepository();

       // courses.add(new Course(1, "Asp.NET MVC", new Date("2017/10/11"), 10));
       // courses.add(new Course(2, "Javascript", new Date("2017/10/11"), 10));
       // courses.add(new Course(3, "Trains", new Date("2017/10/11"), 10));
    }

    @GetMapping("/courses")
    public String index(Model model){

        model.addAttribute("cou", courses.readAll());
        return "courses/index";
    }

    @GetMapping("/courses/details")
    public String details(@RequestParam("id") int id, Model model) {
        model.addAttribute("course", courses.readOneWithEnrollments(id));
        return "/courses/details";
    }

}
