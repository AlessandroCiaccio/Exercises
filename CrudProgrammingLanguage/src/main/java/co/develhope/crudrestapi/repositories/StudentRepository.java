package co.develhope.crudrestapi.repositories;

import co.develhope.crudrestapi.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
