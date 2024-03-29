package edu.javacourse.studentorder.domain;


import java.time.LocalDate;

public class Adult extends Person {
  private String passportSeria;
  private String passportNumber;
  private LocalDate issueDate;
  private String issueDepartment;
  private String university;
  private String studentId;

  public Adult(String surName, String giveName, String patronymic, LocalDate dateOfBirth) {
    super(surName, giveName, patronymic, dateOfBirth,null);
  }


  public Adult(String surName, String giveName, String patronymic, LocalDate dateOfBirth, Address addres, String passportSeria) {
    super(surName, giveName, patronymic, null, addres);
    this.passportSeria = passportSeria;
  }

  public String getSurNume(){
    return "";
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getPassportSeria() {
    return passportSeria;
  }

  public void setPassportSeria(String passportSeria) {
    this.passportSeria = passportSeria;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
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
