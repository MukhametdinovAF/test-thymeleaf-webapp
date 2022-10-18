package ru.mukhametdinov.testthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mukhametdinov.testthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
