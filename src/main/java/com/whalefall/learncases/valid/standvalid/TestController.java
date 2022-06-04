package com.whalefall.learncases.valid.standvalid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author WhaleFall
 * @create 2022-05-22 21:41
 */
@RestController
@Slf4j
public class TestController {
    @RequestMapping(value = "/saveBasicInfo", method = RequestMethod.POST)
    public String saveBasicInfo(
            @Valid @ModelAttribute("useraccount") UserAccount useraccount
            /*,BindingResult result*/) {
       /* if (result.hasErrors()) {
            return result.getFieldError().getDefaultMessage();
        }*/
        return "success";
    }

    @GetMapping("/")
    public String defaultRequest() {
        return "Hello, World";
    }

}
