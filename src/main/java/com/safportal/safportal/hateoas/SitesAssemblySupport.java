package com.safportal.safportal.hateoas;

import com.safportal.safportal.controllers.Controllers;
import com.safportal.safportal.models.SitesModel;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class SitesAssemblySupport extends RepresentationModelAssemblerSupport<SitesModel,SitesRepresentation> {

    public SitesAssemblySupport(Class<Controllers> controllerClass, Class<SitesRepresentation> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    public SitesRepresentation toModel(SitesModel entity) {
        return null;
    }

    @Override
    public CollectionModel<SitesRepresentation> toCollectionModel(Iterable<? extends SitesModel> entities) {
        return super.toCollectionModel(entities);
    }
}
