package poly.edu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RectangleController {

    @Autowired
    private HttpServletRequest request;

    // Hiển thị form nhập
    @GetMapping("/rectangle/form")
    public String form() {
        return "rectangle"; // rectangle.html
    }

    // Xử lý tính toán
    @PostMapping("/rectangle/calc")
    public String calc(Model model) {
        double length = Double.parseDouble(request.getParameter("length"));
        double width = Double.parseDouble(request.getParameter("width"));
        double hight = Double.parseDouble(request.getParameter("hight"));

        double area = length * width;
        double perimeter = 2 * (length + width);

        double v = length * width * hight;
        
        model.addAttribute("area", area);
        model.addAttribute("perimeter", perimeter);
        model.addAttribute("v", v);

        return "rectangle";
    }
}
