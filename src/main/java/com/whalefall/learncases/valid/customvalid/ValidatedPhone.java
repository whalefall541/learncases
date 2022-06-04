package com.whalefall.learncases.valid.customvalid;

import lombok.Data;

/**
 * @author WhaleFall
 * @create 2022-06-04 22:31
 * @codelink
 */
@Data
public class ValidatedPhone {
    @ContactNumberConstraint(message = "号码格式不正确")
    private String phone;
}
