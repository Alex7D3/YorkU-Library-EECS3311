package com.yorku.library.restservice.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yorku.library.restservice.models.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

	List<Course> findByCourseCode(String code);
}
