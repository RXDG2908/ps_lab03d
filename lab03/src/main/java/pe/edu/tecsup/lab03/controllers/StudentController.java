package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentController {
    private final StudentService service;

    public StudentController() {
        this(new StudentService());
    }

    public StudentController(StudentService service) {
        this.service = service;
    }

    public StudentEntity create(StudentEntity student) {
        return service.save(student);
    }

    public Optional<StudentEntity> findById(Long id) {
        return service.findById(id);
    }

    public List<StudentEntity> findAll() {
        return service.findAll();
    }

    public boolean delete(Long id) {
        return service.deleteById(id);
    }
}
