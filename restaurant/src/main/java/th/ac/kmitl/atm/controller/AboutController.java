package th.ac.kmitl.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    @RequestMapping("/About")
    public String getcontact(Model model) {
        return "About";
    }
}
