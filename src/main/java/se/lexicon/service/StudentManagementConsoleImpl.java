package se.lexicon.service;

import org.springframework.stereotype.Component;
import se.lexicon.data_access.StudentDao;
import se.lexicon.models.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }

    UserInputService scannereService;
    StudentDao studentDao;
}


