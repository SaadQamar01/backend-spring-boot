package com.practice.backend.practicebackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends MongoRepository<Course, Long> {
}
