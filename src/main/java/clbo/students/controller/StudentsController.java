package clbo.students.controller;

import clbo.students.model.Student;
import clbo.students.repositories.IStudentsRepository;
import clbo.students.repositories.StudentsDbRepository;
import clbo.students.repositories.StudentsFileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class StudentsController {

    private ArrayList<Student> students = new ArrayList<>();

    private IStudentsRepository studentsRepository;

    public StudentsController() {

        // Change the "new object" to the repository you want to use
        // (e.g StudentsFileRepository() or StudentsArrayListRepository() or StudentsDbRepository())
        
        studentsRepository = new StudentsDbRepository();
    }


    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("stu", studentsRepository.readAll());
        return "index";
    }

    @GetMapping("/create")
    public String create() {

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {

        studentsRepository.create(student);
        return "redirect:/";

    }

    @GetMapping("/details")
    public String details(@RequestParam("id") int id, Model model) {

        Student student = studentsRepository.read(id);
        model.addAttribute("student", student);
        return "details";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {

        Student student = studentsRepository.read(id);
        model.addAttribute("student", student);
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Student student) {

        studentsRepository.update(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {

        Student student = studentsRepository.read(id);
        model.addAttribute("student", student);

        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Student student) {

        studentsRepository.delete(student.getId());
        return "redirect:/";
    }

}
