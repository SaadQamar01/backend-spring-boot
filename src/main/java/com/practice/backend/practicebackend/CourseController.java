package com.practice.backend.practicebackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CourseController {
  @Autowired
  private CourseService coursesService;

  @GetMapping("/home")
  public String home() {
    return "this is home pgae";
  }

  @GetMapping("/courses")
  public List<Course> getCourses() {
    return this.coursesService.getCourses();
  }

  @GetMapping("/courses/{courseId}")
  public Course getCourse(@PathVariable String courseId) {
    return this.coursesService.getCourse(Long.parseLong(courseId));
  }

  @PostMapping("/courses")
  public Course addCourse(@RequestBody Course course) {
    return this.coursesService.addCourse(course);
  }

  @PutMapping("/courses")
  public Course updateCourse(@RequestBody Course course) {
    return this.coursesService.updateCourse(course);
  }

  @DeleteMapping("/courses/{courseId}")
  public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
    try {
      this.coursesService.deleteCourse(Long.parseLong(courseId));
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
