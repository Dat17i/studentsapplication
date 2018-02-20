package clbo.students.controller;

import clbo.students.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class StudentsController {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentsController(){
        students.add(new Student(1, "Claus", "Bove", new Date("2017/10/11"), "2210999999"));
        students.add(new Student(2, "Anna", "Bove", new Date(2017, 12, 12), "22199"));
        students.add(new Student(3, "Poul", "ffffff", new Date(2017, 2, 10), "221fadsda0999999"));

    }
/*
    {
        students.add(new Student(1, "Claus", "Bove", new Date("2017/10/11"), "2210999999"));
        students.add(new Student(2, "Anna", "Bove", new Date(2017, 12, 12), "22199"));
        students.add(new Student(3, "Poul", "ffffff", new Date(2017, 2, 10), "221fadsda0999999"));

    }*/

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("stu", students);
        return "index";
    }

    @GetMapping("/create")
    public String create(){

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student){

        System.out.println(student);
        students.add(student);

        return "redirect:/";

    }

}
