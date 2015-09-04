package com.alberto.tinkering.rest.atomlinks.exception;

import javax.ws.rs.WebApplicationException;

/**
 * RestCustomException
 *
 * @author <a href="mailto:nobuj_000@gmail.com">nobuj_000</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
public class RestCustomException extends WebApplicationException {

    /** long for serialVersionUID */
    private static final long serialVersionUID = -5480654182634394499L;

    /**
     * RestCustomException for message
     * 
     * @param message
     */
    public RestCustomException(final String message) {
	super(message);
    }

}
