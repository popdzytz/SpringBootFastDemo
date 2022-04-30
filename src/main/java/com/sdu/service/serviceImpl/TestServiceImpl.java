package com.sdu.service.serviceImpl;

import com.sdu.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    /**
     * @param a
     * @param b
     * @Description: 返回两数之和
     * @Author: popdzytz
     * @Date: 2022/4/30 14:23
     */
    @Override
    public Integer getSum(int a, int b) {
        return a + b;
    }

}
