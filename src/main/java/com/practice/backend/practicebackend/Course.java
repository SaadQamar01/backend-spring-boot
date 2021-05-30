package com.practice.backend.practicebackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "course")
public class Course {
  @Id
  // @Indexed(unique = true)
  // @Field(value = "id")
  private long id;

  @Field(value = "title")
  private String title;

  @Field(value = "description")
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