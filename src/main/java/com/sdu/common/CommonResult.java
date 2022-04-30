package com.sdu.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private String code;
    private String message;
    private T data;

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CommonResult responseWithoutData(GlobalVar.RespCode resultCode) {
        return new CommonResult(resultCode.getErrCode(), resultCode.getErrMsg());
    }

    public static<T> CommonResult responseWithData(GlobalVar.RespCode resultCode, T data) {
        return new CommonResult(resultCode.getErrCode(), resultCode.getErrMsg(), data);
    }
}
