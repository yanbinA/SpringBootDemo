package com.yanbin.helloboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Method;

/**
 * @author yanbin
 * @date 2018-06-25 16:11
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Autowired
    private Person person;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello welcome StringBoot!";
    }

    @RequestMapping(value = "/info/{id}")
    public String info(@PathVariable("id") Integer value) {
        return "name:" + name + ", age:" + age + ", id:" + value;
    }

    @RequestMapping(value = "person")
    public String person() {
        return person.toString();
    }
}
