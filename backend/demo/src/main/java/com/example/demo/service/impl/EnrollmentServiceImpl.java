package com.example.demo.service.impl;

import com.example.demo.mapper.EnrollmentMapper;
import com.example.demo.pojo.Enrollment;
import com.example.demo.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl  implements EnrollmentService {
    @Autowired
    private EnrollmentMapper enrollmentMapper;

    @Override
    public List<Enrollment> selectAllEnrollment() {
        List<Enrollment> enrollments = enrollmentMapper.selectAll();
        return enrollments;
    }


    //删
    @Override
    public void deleteEnrollment(Integer id) {
        enrollmentMapper.deleteById(id);
    }

    @Override
    public void addEnrollment(Enrollment enrollment) {
            enrollmentMapper.insert(enrollment);
    }

    @Override
    public void updateEnrollment(Enrollment enrollment) {
        enrollmentMapper.update(enrollment);
    }
}
