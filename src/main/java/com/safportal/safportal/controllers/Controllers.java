package com.safportal.safportal.controllers;

import com.safportal.safportal.models.SitesModel;
import com.safportal.safportal.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {

    @Autowired
    SiteService siteService;


    @GetMapping(value = "/index")
    public String indexPage(Model model) {

        List<SitesModel> sites = siteService.getAllSites();
        model.addAttribute("sites", sites);
    }


        @GetMapping(value = "/index")
        public String sites (Model model){
            List<SitesModel> sites = new ArrayList<>();
            sites = siteService.getAllSites();
            model.addAttribute("sites", sites);

            return "index";
        }

        @GetMapping(value = "/pagetwo")
        public String pagetwo (Model model){
            List<SitesModel> sites = new ArrayList<>();
            sites = siteService.getAllSites();
            model.addAttribute("sites", sites);
            return "pagetwo";
        }
    }

