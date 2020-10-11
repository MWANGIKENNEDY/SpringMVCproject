package com.safportal.safportal.restful;

import com.safportal.safportal.models.SitesModel;
import com.safportal.safportal.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class RestfulApi {

    @Autowired
    SiteService siteService;

    @PostMapping(value = "/addsite")
    public ResponseEntity<Object> addSite(@RequestBody SitesModel sitesModel){
        siteService.addSite(sitesModel);
        return new ResponseEntity<>("Site added", HttpStatus.CREATED);
    }





    
}
