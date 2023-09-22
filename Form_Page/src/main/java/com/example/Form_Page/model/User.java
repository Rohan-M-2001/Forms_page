package com.example.Form_Page.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
  @Id
  private String id;

  private String name;

  private String email;

  private String contact;

  private String reportingToBase;

  private String notReportingReason;

  private String certifications;

  private String benchStatus;

  private String profession;

  private String interest;

  private String reference;

  /**
   * @return profession
   */
  public String getProfession() {

    return this.profession;
  }

  /**
   * @param profession new value of {@link #getprofession}.
   */
  public void setProfession(String profession) {

    this.profession = profession;
  }

  /**
   * @return interest
   */
  public String getInterest() {

    return this.interest;
  }

  /**
   * @param interest new value of {@link #getinterest}.
   */
  public void setInterest(String interest) {

    this.interest = interest;
  }

  /**
   * @return reference
   */
  public String getReference() {

    return this.reference;
  }

  /**
   * @param reference new value of {@link #getreference}.
   */
  public void setReference(String reference) {

    this.reference = reference;
  }

  /**
   * @return id
   */
  public String getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(String id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return contact
   */
  public String getContact() {

    return this.contact;
  }

  /**
   * @param contact new value of {@link #getcontact}.
   */
  public void setContact(String contact) {

    this.contact = contact;
  }

  /**
   * @return reportingToBase
   */
  public String getReportingToBase() {

    return this.reportingToBase;
  }

  /**
   * @param reportingToBase new value of {@link #getreportingToBase}.
   */
  public void setReportingToBase(String reportingToBase) {

    this.reportingToBase = reportingToBase;
  }

  /**
   * @return notReportingReason
   */
  public String getNotReportingReason() {

    return this.notReportingReason;
  }

  /**
   * @param notReportingReason new value of {@link #getnotReportingReason}.
   */
  public void setNotReportingReason(String notReportingReason) {

    this.notReportingReason = notReportingReason;
  }

  /**
   * @return certifications
   */
  public String getCertifications() {

    return this.certifications;
  }

  /**
   * @param certifications new value of {@link #getcertifications}.
   */
  public void setCertifications(String certifications) {

    this.certifications = certifications;
  }

  /**
   * @return benchStatus
   */
  public String getBenchStatus() {

    return this.benchStatus;
  }

  /**
   * @param benchStatus new value of {@link #getbenchStatus}.
   */
  public void setBenchStatus(String benchStatus) {

    this.benchStatus = benchStatus;
  }

  // getters and setters
}
