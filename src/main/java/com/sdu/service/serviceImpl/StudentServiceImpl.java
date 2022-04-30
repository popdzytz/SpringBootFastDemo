package com.sdu.service.serviceImpl;

import com.sdu.dao.StudentMapper;
import com.sdu.entity.Student;
import com.sdu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    /**
     * @param student
     * @Description: 插入学生信息
     * @Author: popdzytz
     * @Date: 2022/4/30 14:58
     */
    @Override
    public boolean insertStudent(Student student) {
        if (studentMapper.insertSelective(student) == 1) {
            return true;
        }
        return false;
    }

    /**
     * @param studentID
     * @Description: 获取学生信息
     * @Author: popdzytz
     * @Date: 2022/4/30 15:15
     */
    @Override
    public Student getStudentInfo(int studentID) {
        return studentMapper.selectByPrimaryKey(studentID);
    }
}
