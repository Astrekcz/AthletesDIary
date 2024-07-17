package org.example.athletesdiary.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MVController {

    @GetMapping
    public String LandingPage(Model model){
        return "index";
    }

}
