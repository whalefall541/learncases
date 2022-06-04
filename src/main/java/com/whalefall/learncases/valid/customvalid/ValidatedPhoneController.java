package com.whalefall.learncases.valid.customvalid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author WhaleFall
 * @create 2022-06-04 22:30
 * @codelink
 */
@RestController
public class ValidatedPhoneController {

    @PostMapping("/addValidatePhone")
    public String submitForm(@Valid ValidatedPhone validatedPhone/*, BindingResult result*/) {
       /* if (result.hasErrors()) {
            return result.getFieldError().getDefaultMessage();
        }*/
        return "OK";
    }
}