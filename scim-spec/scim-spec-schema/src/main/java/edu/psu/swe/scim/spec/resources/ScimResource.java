package edu.psu.swe.scim.spec.resources;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import edu.psu.swe.scim.spec.schema.BaseResource;
import edu.psu.swe.scim.spec.schema.Meta;
import edu.psu.swe.scim.spec.validator.Urn;

/**
 * This class defines the attributes shared by all SCIM resources.  It also
 * provides BVF annotations to allow validation of the POJO.
 * 
 * @author smoyer1
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class ScimResource extends BaseResource {
  
  @XmlElement
  @NotNull
  Meta meta;
  
  @Urn
  @XmlElement
  @Size(min = 1, max = 65535)
  String id;
  
  @XmlElement
  String externalId;
  
  
  private Map<String, ScimExtension> extensions = new HashMap<String, ScimExtension>();


  /**
   * @return the meta
   */
  public Meta getMeta() {
    return meta;
  }

  /**
   * @param meta the meta to set
   */
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the externalId
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * @param externalId the externalId to set
   */
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

}