package poly.edu;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import poly.edu.model.*;

@Controller
public class StaffController {

    @GetMapping("/staff/detail")
    public String detail(Model model) {
        // Nếu dùng Lombok builder:
        Staff staff = Staff.builder()
                .id("user@gmail.com")
                .fullname("nguyễn văn user")
                .level(2)
                .build();

        // Nếu không dùng Lombok:
        // Staff staff = new Staff();
        // staff.setId("user@gmail.com");
        // staff.setFullname("nguyễn văn user");
        // staff.setLevel(2);

        model.addAttribute("staff", staff);
        // đặt file staff-detail.html trong templates/demo/
        return "staff-detail";
    }
}
