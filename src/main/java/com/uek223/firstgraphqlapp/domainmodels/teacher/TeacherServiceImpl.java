package com.uek223.firstgraphqlapp.domainmodels.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public Teacher updateById(int id, Teacher teacher) {
        if(teacherRepository.existsById(id)) {
            teacher.setId((long) id);
            teacherRepository.save(teacher);

            return teacher;
        } else {
            throw new NoSuchElementException("No value");
        }
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }
}
