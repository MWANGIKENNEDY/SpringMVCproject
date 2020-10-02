package com.safportal.safportal.repos;

import com.safportal.safportal.models.SitesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SitesRepo extends JpaRepository<SitesModel,Long> {

    @Query("select s from SitesModel s where s.region like %:name%")
    public List<SitesModel> searchOneColumn(String name);

    @Query("select s from SitesModel s where s.region like %:name% or s.site_name like %:region%")
    public List<SitesModel> searchMultipleColumns(String name);

}
