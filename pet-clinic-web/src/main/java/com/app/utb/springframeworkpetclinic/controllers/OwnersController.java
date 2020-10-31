package com.app.utb.springframeworkpetclinic.controllers;

import com.app.utb.springframeworkpetclinic.model.Owner;
import com.app.utb.springframeworkpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/owners")
public class OwnersController {


    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index/html"})
    public String listOwners(Model model){
        Set<Owner> ownerSet = ownerService.findAll();
        model.addAttribute("owners", ownerSet);
        return "owners/index";
    }
}
