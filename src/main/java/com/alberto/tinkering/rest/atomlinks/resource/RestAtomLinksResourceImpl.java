package com.alberto.tinkering.rest.atomlinks.resource;

import com.alberto.tinkering.rest.atomlinks.exception.RestCustomException;
import com.alberto.tinkering.rest.atomlinks.model.Model;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;

/**
 * RestAtomLinksResourceImpl
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
public class RestAtomLinksResourceImpl implements RestAtomLinksResource {

    /**
     * Overrides getModels
     *
     * @return Collection<Model>
     * @since Sep 3, 2015
     * @see com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResource#getModels()
     */
    @Override
    public Collection<Model> getModels() {
	final Collection<Model> results = new ArrayList<>();
	results.add(new Model("1", "model #1"));
	results.add(new Model("2", "model #2"));
	results.add(new Model("3", "model #3"));
	results.add(new Model("4", "model #4"));
	return results;
    }

    /**
     * Overrides addModel
     *
     * @param model
     * @since Sep 3, 2015
     * @see com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResource#addModel(com.alberto.tinkering.rest.atomlinks.model.Model)
     */
    @Override
    public void addModel(final Model model) {
	// TODO Auto-generated method stub

    }

    /**
     * Overrides getModel
     *
     * @param id
     * @return Model
     * @since Sep 3, 2015
     * @see com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResource#getModel(java.lang.String)
     */
    @Override
    public Model getModel(final String id) {
	// For testing purposes throw a NotFoundException :)
	throw new NotFoundException(String.format("Model %s not found", id));
    }

    /**
     * Overrides updateModel
     *
     * @param id
     * @param model
     * @since Sep 3, 2015
     * @see com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResource#updateModel(java.lang.String,
     *      com.alberto.tinkering.rest.atomlinks.model.Model)
     */
    @Override
    public void updateModel(final String id, final Model model) {
	throw new InternalServerErrorException(String.format("Unable to update Model %s", id));

    }

    /**
     * Overrides deleteModel
     *
     * @param id
     * @since Sep 3, 2015
     * @see com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResource#deleteModel(java.lang.String)
     */
    @Override
    public void deleteModel(final String id) {
	throw new RestCustomException(String.format("Unable to delete Model %s", id));

    }

}
