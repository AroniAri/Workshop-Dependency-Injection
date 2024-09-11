package se.lexicon.data_access;

import se.lexicon.models.Student;

import java.util.List;

public interface StudentDao  {

    Student save (Student student);
    List<Student> findAll();
    Student find(int id);
    void delete(int id);

}
