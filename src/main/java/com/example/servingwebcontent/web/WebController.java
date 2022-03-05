package com.example.servingwebcontent.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class WebController {

    @GetMapping("/contact_info")
    public ModelAndView home(HttpSession session) {
        log.debug("Load contact_info page!");
        ModelAndView modelAndView = new ModelAndView("contact_info");
        return modelAndView;
    }

}
