/*
package com.app.utb.springframeworkpetclinic.controllers;

import com.app.utb.springframeworkpetclinic.services.VisitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @RequestMapping("/visits")
    public String allVisits(Model model){
        model.addAttribute("visits",visitService.findAll());
        return "/visits/index";
    }
}
*/
