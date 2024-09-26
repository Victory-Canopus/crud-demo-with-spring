package crud.demo.crupdemo.dao;

import crud.demo.crupdemo.entity.Student;

public interface StudentDAO {
    void save(Student student) ;
    Student read(int id);
}
