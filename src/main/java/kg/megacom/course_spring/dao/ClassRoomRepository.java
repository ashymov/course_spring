package kg.megacom.course_spring.dao;

import kg.megacom.course_spring.entities.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepository extends JpaRepository<ClassRoom,Long > {
}
