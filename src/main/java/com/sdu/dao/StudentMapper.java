package com.sdu.dao;

import com.sdu.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stduentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stduentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}