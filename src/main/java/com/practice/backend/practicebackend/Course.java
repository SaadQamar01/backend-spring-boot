package com.practice.backend.practicebackend;

public class Course {
  private long id;
  private String title;
  private String description;

  public Course(long id, String title, String description) {
    super();
    this.id = id;
    this.title = title;
    this.description = description;
  }

  public Course() {
    super();
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", title='" + getTitle() + "'" +
      ", description='" + getDescription() + "'" +
      "}";
  }

}