package com.yanbin.helloboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @author yanbin
 * @date 2018-06-25 16:11
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello welcome StringBoot!";
    }

}
