package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentRepository {
    private final Map<Long, StudentEntity> students = new LinkedHashMap<>();

    public StudentEntity save(StudentEntity student) {
        students.put(student.getId(), student);
        return student;
    }

    public Optional<StudentEntity> findById(Long id) {
        return Optional.ofNullable(students.get(id));
    }

    public List<StudentEntity> findAll() {
        return new ArrayList<>(students.values());
    }

    public boolean deleteById(Long id) {
        return students.remove(id) != null;
    }
}