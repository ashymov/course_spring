package kg.megacom.course_spring.dao;

import kg.megacom.course_spring.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findAllByStartDateGreaterThan(Date date);

}
