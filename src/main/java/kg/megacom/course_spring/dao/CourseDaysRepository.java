package kg.megacom.course_spring.dao;

import kg.megacom.course_spring.entities.CourseDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDaysRepository extends JpaRepository<CourseDays,Long> {
}
