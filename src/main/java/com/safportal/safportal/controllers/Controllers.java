package com.safportal.safportal.controllers;

import com.safportal.safportal.models.SitesModel;
import com.safportal.safportal.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Controllers {

    @Autowired
    SiteService siteService;


    @GetMapping(value = "/index")
    public String indexPage(Model model){

        List<SitesModel> sites=siteService.getAllSites();
        model.addAttribute("sites",sites);

        return "index";
    }
}
