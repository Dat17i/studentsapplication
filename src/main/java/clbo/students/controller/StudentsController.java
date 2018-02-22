package clbo.students.controller;

import clbo.students.model.Student;
import clbo.students.repositories.IStudentsRepository;
import clbo.students.repositories.StudentsArrayListRepository;
import clbo.students.repositories.StudentsWriteToFileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class StudentsController {

   private ArrayList<Student> students = new ArrayList<>();

    private IStudentsRepository studentsRepository;

    public StudentsController(){
        studentsRepository = new StudentsWriteToFileRepository();
    }


    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("stu", studentsRepository.readAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(){

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student){

        studentsRepository.create(student);

        return "redirect:/";

    }

    @GetMapping("/details")
    public String details(@RequestParam("id") int id, Model model){

        System.out.println(id);
        Student stud = students.get(id-1);

        model.addAttribute("student", stud);

        return "details";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){

        model.addAttribute("student", studentsRepository.read(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Student student){

        studentsRepository.update(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

       // Student stud = students.get(id-1);
       // students.remove(stud.getId()-1);

        Student stud = students.get(id-1);
        model.addAttribute("student", stud);

        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Student student){

        students.remove(student.getId()-1);
        return "redirect:/";
    }

}
