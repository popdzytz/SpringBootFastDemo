package com.sdu.service;

import com.sdu.entity.Student;

public interface StudentService {

    /**
     * @Description:  插入学生信息
     * @Author: popdzytz
     * @Date: 2022/4/30 14:58
     */
    boolean insertStudent(Student student);

    /**
     * @Description:  获取学生信息
     * @Author: popdzytz
     * @Date: 2022/4/30 15:15
     */
    Student getStudentInfo(int studentID);

}
