package com.xwbing.shiro;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 项目名称: boot-module-demo
 * 创建时间: 2018/3/28 14:44
 * 作者: xiangwb
 * 说明: :扩展默认的用户认证的bean
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UsernamePasswordCaptchaToken extends UsernamePasswordToken {
    private static final long serialVersionUID = 6059396037971862504L;
    private String captcha;

    public UsernamePasswordCaptchaToken(String username, char[] password, boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }
}
