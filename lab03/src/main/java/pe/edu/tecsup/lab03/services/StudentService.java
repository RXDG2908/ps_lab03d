package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentService {
    private final StudentRepository repository;

    public StudentService() {
        this(new StudentRepository());
    }

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentEntity save(StudentEntity student) {
        return repository.save(student);
    }

    public Optional<StudentEntity> findById(Long id) {
        return repository.findById(id);
    }

    public List<StudentEntity> findAll() {
        return repository.findAll();
    }

    public boolean deleteById(Long id) {
        return repository.deleteById(id);
    }
}