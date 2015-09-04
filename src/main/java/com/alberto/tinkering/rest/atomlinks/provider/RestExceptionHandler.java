package com.alberto.tinkering.rest.atomlinks.provider;

import com.alberto.tinkering.rest.atomlinks.exception.RestCustomException;
import com.alberto.tinkering.rest.atomlinks.model.ErrorResponse;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * RestExceptionHandler
 *
 * @author <a href="mailto:nobuj_000@gmail.com">nobuj_000</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
@Provider
public class RestExceptionHandler implements ExceptionMapper<WebApplicationException> {

    /**
     * Overrides toResponse
     *
     * @param arg0
     * @return Response
     * @since Sep 3, 2015
     * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
     */
    @Override
    public Response toResponse(final WebApplicationException arg0) {
	// case NotFound (404):
	if (arg0 instanceof NotFoundException) {
	    final ErrorResponse response = new ErrorResponse();
	    final NotFoundException e = (NotFoundException) arg0;
	    response.setStatus(Response.Status.NOT_FOUND.getStatusCode());
	    response.setMessage(e.getMessage());
	    return Response.status(Response.Status.NOT_FOUND).entity(response).type(MediaType.APPLICATION_JSON_TYPE)
		    .build();
	}

	// case Internal Error (500):
	if (arg0 instanceof InternalServerErrorException) {
	    final ErrorResponse response = new ErrorResponse();
	    final InternalServerErrorException e = (InternalServerErrorException) arg0;
	    response.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
	    response.setMessage(e.getMessage());
	    return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(response)
		    .type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	// case custom exception (400)
	if (arg0 instanceof RestCustomException) {
	    final ErrorResponse response = new ErrorResponse();
	    final RestCustomException e = (RestCustomException) arg0;
	    response.setStatus(Response.Status.BAD_REQUEST.getStatusCode());
	    response.setMessage(e.getMessage());
	    return Response.status(Response.Status.BAD_REQUEST).entity(response).type(MediaType.APPLICATION_JSON_TYPE)
		    .build();
	}

	// Add more cases as needed according to your REST API

	return null;
    }

}
