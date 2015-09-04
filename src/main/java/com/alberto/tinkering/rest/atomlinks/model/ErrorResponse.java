package com.alberto.tinkering.rest.atomlinks.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ErrorResponse
 *
 * @author <a href="mailto:nobuj_000@gmail.com">nobuj_000</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class ErrorResponse implements Serializable {
    /** long for serialVersionUID */
    private static final long serialVersionUID = 5875572480921960817L;
    /** ErrorResponse for status */
    @XmlElement
    int status;

    /**
     * @return the status
     */
    public int getStatus() {
	return status;
    }

    /**
     * @param value
     *            the status to set
     */
    public void setStatus(final int value) {
	this.status = value;
    }

    /**
     * @return the message
     */
    public String getMessage() {
	return message;
    }

    /**
     * @param value
     *            the message to set
     */
    public void setMessage(final String value) {
	this.message = value;
    }

    /** ErrorResponse for message */
    @XmlElement
    String message;

}
