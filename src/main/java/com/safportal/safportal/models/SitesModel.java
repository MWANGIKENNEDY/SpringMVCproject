package com.safportal.safportal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SitesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String region;

    String tower_id;

    String site_name;

    String cell_type;

    String field_engineer;

    int telephone_number;

}
