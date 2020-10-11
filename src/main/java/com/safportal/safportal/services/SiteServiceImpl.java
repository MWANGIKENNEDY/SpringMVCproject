package com.safportal.safportal.services;

import com.safportal.safportal.models.SitesModel;
import com.safportal.safportal.repos.SitesRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SiteServiceImpl implements SiteService {
    @Autowired
    SitesRepo sitesRepo;
    //Add a new site
    @Override
    public void addSite(SitesModel sitesModel) {
        sitesRepo.save(sitesModel);
    }
    //Get all sites details
    @Override
    public List<SitesModel> getAllSites() {
        return sitesRepo.findAll();
    }
    @Override
    public List<SitesModel> searchSite(String query) {
        return sitesRepo.searchOneColumn(query);
    }
}
