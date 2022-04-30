package com.sdu.common;

public class GlobalVar {
    /**
     * @Description: 状态码返回信息
     * @Author: popdzytz
     * @Date: 2020/9/19 14:45
     */
    public enum RespCode {

        /**
         * 错误来源：用户-A
         */
        USER_DISABLED_PARAM("A0001", "传递空/错误的参数"),

        /**
         * 错误来源：系统内部-B
         */
        SYS_EXECUTE_ERR("B0001", "系统执行出错"),
        SYS_DATABASE_SELECT_ERR("B0002", "系统查询数据库数据出错"),
        SYS_DATABASE_INSERT_ERR("B0003", "系统插入数据库数据出错"),
        SYS_DATABASE_UPDATE_ERR("B0004", "系统更新数据库数据出错"),
        SYS_REDIS_SET_ERR("B0005", "系统写入缓存数据出错"),
        SYS_REDIS_GET_ERR("B0006", "系统读取缓存数据出错"),
        SYS_SYSTEM_TIMEOUT_ERR("B0007", "系统请求超时"),
        SYS_DATABASE_DELETE_ERR("B0008", "系统删除数据库数据出错"),

        /**
         * 错误来源：第三方服务-C
         */

        /**
         * 正常运行状态码
         */
        SUCCESS("00000", "执行成功");

        private String errCode;
        private String errMsg;

        RespCode(String errCode, String errMsg) {
            this.errCode = errCode;
            this.errMsg = errMsg;
        }

        public String getErrCode() {
            return errCode;
        }

        public String getErrMsg() {
            return errMsg;
        }
    }
}
