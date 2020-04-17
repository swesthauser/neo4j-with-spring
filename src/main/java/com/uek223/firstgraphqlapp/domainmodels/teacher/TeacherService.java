package com.uek223.firstgraphqlapp.domainmodels.teacher;

import java.util.List;

public interface TeacherService {

    Teacher create(Teacher teacher);

    List<Teacher> findAll();

    Teacher findById(int id);

    Teacher updateById(int id, Teacher teacher);

    void deleteById(int id);
}
