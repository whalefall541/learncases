package com.whalefall.learncases.valid.standvalid;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author chenglong
 * @Description
 * @create 2022-05-22 21:42
 */
@Data
@ToString
public class UserAccount {

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 15, message = "密码位数在6到15位之间")
    private String password;

    @Pattern(regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", message = "邮箱格式不正确!")
    @NotNull
    private String email;
}
