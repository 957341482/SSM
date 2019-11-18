package com.jbit.entity;


public class Student {

  private int stuNo;
  private String name;
  private int age;
  private String sex;
  private String telephone;
  private String email;
  private int gradeId;
  private String stuIdCard;

  @Override
  public String toString() {
    return "Student{" +
            "stuNo=" + stuNo +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", telephone='" + telephone + '\'' +
            ", email='" + email + '\'' +
            ", gradeId=" + gradeId +
            ", stuIdCard='" + stuIdCard + '\'' +
            '}';
  }

  public Student() {
  }

  public Student(int stuNo, String name, int age, String sex, String telephone, String email, int gradeId,
                 String stuIdCard) {
    this.stuNo = stuNo;
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.telephone = telephone;
    this.email = email;
    this.gradeId = gradeId;
    this.stuIdCard = stuIdCard;
  }

  public int getStuNo() {
    return stuNo;
  }

  public void setStuNo(int stuNo) {
    this.stuNo = stuNo;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public int getGradeId() {
    return gradeId;
  }

  public void setGradeId(int gradeId) {
    this.gradeId = gradeId;
  }


  public String getStuIdCard() {
    return stuIdCard;
  }

  public void setStuIdCard(String stuIdCard) {
    this.stuIdCard = stuIdCard;
  }

}
