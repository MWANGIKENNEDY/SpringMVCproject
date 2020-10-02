package com.safportal.safportal.services;

import com.safportal.safportal.models.SitesModel;

import java.util.List;

public interface SiteService {
    //Get all sites details service
    public List<SitesModel> getAllSites();
    //Search item
    public List<SitesModel> searchSite(String query);
}
