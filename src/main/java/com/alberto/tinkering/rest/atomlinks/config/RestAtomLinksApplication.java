package com.alberto.tinkering.rest.atomlinks.config;

import com.alberto.tinkering.rest.atomlinks.provider.RestExceptionHandler;
import com.alberto.tinkering.rest.atomlinks.resource.RestAtomLinksResourceImpl;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * RestAtomLinksApplication
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
@ApplicationPath("rest")
public class RestAtomLinksApplication extends Application {

    private final Set<Class<?>> resources = new HashSet<>();

    /**
     * Overrides getClasses
     *
     * @return Set<Class<?>>
     * @since Sep 3, 2015
     * @see javax.ws.rs.core.Application#getClasses()
     */
    @Override
    public Set<Class<?>> getClasses() {
	resources.add(RestAtomLinksResourceImpl.class);
	resources.add(RestExceptionHandler.class);
	return resources;
    }

}
