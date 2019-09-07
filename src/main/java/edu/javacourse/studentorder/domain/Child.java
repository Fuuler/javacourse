package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person {
  private String certificateNumber;
  private LocalDate issueDate;
  private String issueDepartment;

  public Child(String surName, String giveName, String patronymic, LocalDate dateOfBirth) {
    super(surName, giveName, patronymic, dateOfBirth,null);
  }

  public Child(String surName, String giveName, String patronymic, LocalDate dateOfBirth, Address addres, String certificateNumber, LocalDate issueDate, String issueDepartment) {
    super(surName, giveName, patronymic, dateOfBirth, addres);
    this.certificateNumber = certificateNumber;
    this.issueDate = issueDate;
    this.issueDepartment = issueDepartment;
  }

  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public String getIssueDepartment() {
    return issueDepartment;
  }

  public void setIssueDepartment(String issueDepartment) {
    this.issueDepartment = issueDepartment;
  }
}
