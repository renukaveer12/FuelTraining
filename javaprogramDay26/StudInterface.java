package day.dao;

public interface StudInterface {
    void insert(Student st);

    void select(Student st);

    void update(Student st);

    void delete(Student st);

    void EXIT(Student st);

    Student getStud(int id);

}
