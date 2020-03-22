package kg.megacom.course_spring.dao;

import kg.megacom.course_spring.entities.Days;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaysRepository extends JpaRepository<Days,Long> {
}
