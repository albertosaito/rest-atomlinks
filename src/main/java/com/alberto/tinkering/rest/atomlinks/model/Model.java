package com.alberto.tinkering.rest.atomlinks.model;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.links.RESTServiceDiscovery;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom", namespace = "http://www.w3.org/2005/Atom") )
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Model implements Serializable {

    /** long for serialVersionUID */
    private static final long serialVersionUID = -7067264329526752898L;

    /** Model for id */
    @XmlID
    @XmlAttribute
    String id;
    /** Model for name */
    @XmlElement
    String name;

    @XmlElementRef
    private RESTServiceDiscovery rest;

    /**
     * Constructs an instance of Model object.
     *
     * @param idParam
     * @param nameParam
     */
    public Model(final String idParam, final String nameParam) {
	super();
	this.id = idParam;
	this.name = nameParam;
    }

    /**
     * Constructs an instance of Model object.
     */
    public Model() {
	super();
    }

}
