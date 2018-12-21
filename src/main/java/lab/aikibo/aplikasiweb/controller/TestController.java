package lab.aikibo.aplikasiweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/halo")
    public String halo(
            @RequestParam(name = "nama", required = false, defaultValue = "dunia") String paramNama,
            Model model
    ) {
        model.addAttribute("nama", paramNama);
        return "home";
    }

}
