package com.issue_tracker.sitter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class AuthController {

    @GetMapping()
    public String login(@RequestParam(name="name", required = false, defaultValue = "jijer") String name, Model model) {
        model.addAttribute("name", name);
        return "auth/login";
    }

}