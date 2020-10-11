package com.safportal.safportal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SitesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String region;

    private int tower_id;

    private String site_name;

    private String cell_type;

    private String field_engineer;

    private int telephone_number;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTower_id() {
        return tower_id;
    }

    public void setTower_id(int tower_id) {
        this.tower_id = tower_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getCell_type() {
        return cell_type;
    }

    public void setCell_type(String cell_type) {
        this.cell_type = cell_type;
    }

    public String getField_engineer() {
        return field_engineer;
    }

    public void setField_engineer(String field_engineer) {
        this.field_engineer = field_engineer;
    }

    public int getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(int telephone_number) {
        this.telephone_number = telephone_number;
    }
}
