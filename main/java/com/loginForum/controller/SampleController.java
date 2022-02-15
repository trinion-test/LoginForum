package com.loginForum.controller;

import com.loginForum.dto.Sample;
import com.loginForum.form.SampleForm;
import com.loginForum.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SampleController {
    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping(value = "/sample/init")
    public String init(@ModelAttribute SampleForm sampleForm, Model model) {
        List<Sample> samples = sampleService.findAll();
        model.addAttribute("samples", samples);
        return "sample/sample";
    }

    @RequestMapping(value = "/sample/register")
    public String register(@ModelAttribute SampleForm sampleForm) {
        sampleService.save(sampleForm);
        return "redirect:/sample/init";
    }
}
