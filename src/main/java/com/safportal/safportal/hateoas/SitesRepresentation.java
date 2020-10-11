package com.safportal.safportal.hateoas;

import org.springframework.hateoas.RepresentationModel;

public class SitesRepresentation extends RepresentationModel<SitesRepresentation> {
    private Long id;
    private String region;
    private int tower_id;
    private String site_name;
    private String cell_type;
    private String field_engineer;
    private int telephone_number;
}
