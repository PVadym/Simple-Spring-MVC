package ua.avadamedia.forostina.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.avadamedia.forostina.service.employee.EmployeeService;
import ua.avadamedia.forostina.service.product.ProductService;
import ua.avadamedia.forostina.service.raw.RawService;

@Controller
@RequestMapping("/settings")
@RequiredArgsConstructor
public class SettingsController {

    private final EmployeeService employeeService;
    private final RawService rawService;
    private final ProductService productService;

    @GetMapping("/")
    public String settings(Model model){
        model.addAttribute("positions", employeeService.getAllPositions());
        model.addAttribute("rawCategories", rawService.getAllRawCategories());
        model.addAttribute("productCategories", productService.getAllProductCategories());
        return "settings";
    }
}
