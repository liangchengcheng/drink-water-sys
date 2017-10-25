package com.lcc.water.common.enums;

public enum ResultEnum {
    ERROR(0, "系统异常，请求错误"),
    SUCCESS(1, "请求成功"),
    TOKEN_LOSE(2,"token失效，当前会话已过期，需要重新登录"),

    NUKONW_USER_ERROR(001, "用户未注册"),
    DISABLED_USER_ERROR(002, "用户已停用"),
    PASS_USER_ERROR(003, "密码不正确"),
    DELETE_USER_ERROR(004,"删除用户失败"),
    SAVE_USER_ERROR(005,"新增用户失败"),
    ENABLE_USER_ERROR(006,"启用用户失败"),
    DISABLE_USER_ERROR(007,"禁用用户失败"),
    MODFIYPWD_USER_ERROR(8,"旧密码输入错误"),
    SET_USER_ERROR(9,"新密码和确认密码输入不一致"),
    SAVE_WATERSOURCEINFO_ERROR(010,"水源地信息已存在"),
    ADD_INVESTGTION_ERROR(011,"上传水源地排查情况失败"),
    VERIFY_USER_SUCCESS(012,"与原密码相符"),
    VERIFY_USER_ERROR(013,"与原密码不符"),
    SET_USER_ERROR2(014,"修改密码失败"),
    MODFIYPWD_USER_ERROR2(015,"修改密码失败"),
    TEAM_REPETITION(016,"分组名称重复"),
    TEAM_MEMBER_NUKONW(017,"分组用户不存在");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
