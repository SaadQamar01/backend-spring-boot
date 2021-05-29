package com.practice.backend.practicebackend;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService {

  List<Course> list;

  public CourseServiceImp() {
    list = new ArrayList<>();
    list.add(new Course(1, "Java Course", "This is java course"));
    list.add(new Course(2, "React Course", "This is React course"));
    list.add(new Course(3, "Angular Course", "This is Angular course"));
  }

  @Override
  public List<Course> getCourses() {
    return list;
  }

  @Override
  public Course getCourse(long courseId) {
    Course c = null;
    for (Course course:list) {
      if (course.getId() == courseId) {
        c = course;
        break;
      }
    }
    return c;
  }

  @Override
  public Course addCourse(Course course) {
    list.add(course);
    return course;
  }

  @Override
  public Course updateCourse(Course course) {
    list.forEach(e -> {
      if (e.getId() == course.getId()) {
        e.setTitle(course.getTitle());
        e.setDescription(course.getDescription());
      }
    });
    return course;
  }

  @Override
  public void deleteCourse(long courseId) {
    list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
  }
}