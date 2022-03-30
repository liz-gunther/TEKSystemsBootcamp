package com.optum.myfirstspringapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CohortController {

    @GetMapping("/cohort/java")
    public String cohort(@RequestParam(name="topic", required=false, defaultValue="Cohort") String topic,
                           @RequestParam(name="week", required=false, defaultValue="0") int week,
                           Model model) {
        model.addAttribute("topic", topic);
        model.addAttribute("week", week);
        return "cohort";
    }

}