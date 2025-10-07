package poly.edu;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.model.Staff;

@Controller
public class Staff2Controller {

    @RequestMapping("/staff2/lis")
    public String list(Model model) {
        List<Staff> list = List.of(
            Staff.builder().id("A@gmail.com").fullname("nguyễn văn A").salary(1200.5).photo("photo.jpg").build(),
            Staff.builder().id("B@gmail.com").fullname("nguyễn văn B").salary(1500.0).photo("photo.jpg").build(),
            Staff.builder().id("C@gmail.com").fullname("nguyễn văn C").salary(1800.75).photo("photo.jpg").build(),
            Staff.builder().id("D@gmail.com").fullname("nguyễn văn D").salary(2000.0).photo("photo.jpg").build(),
            Staff.builder().id("E@gmail.com").fullname("nguyễn văn E").salary(1700.25).photo("photo.jpg").build(),
            Staff.builder().id("F@gmail.com").fullname("nguyễn văn F").salary(2100.99).photo("photo.jpg").build()
        );
        model.addAttribute("list", list);
        return "list-status";
    }
}
