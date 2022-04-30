package com.sdu.controller;

import com.sdu.common.CommonResult;
import com.sdu.common.GlobalVar;
import com.sdu.entity.Student;
import com.sdu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:  演示用controller
 * @Author: popdzytz
 * @Date: 2022/4/30 14:28
 */
@RestController
@RequestMapping("/student")
public class TestController {

    @Autowired
    StudentService studentService;

    /**
     * @Description:  根据学生ID获取学生信息
     * @Author: popdzytz
     * @Date: 2022/4/30 15:12
     */
    @GetMapping("/getStudentInfo/{studentID}")
    public CommonResult getStudentInfo(@PathVariable("studentID") Integer studentID) {
        if (null == studentID) {
            return CommonResult.responseWithoutData(GlobalVar.RespCode.USER_DISABLED_PARAM);
        }
        Student student = studentService.getStudentInfo(studentID);
        return CommonResult.responseWithData(GlobalVar.RespCode.SUCCESS, student);
    }

}
