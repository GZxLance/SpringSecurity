package top.lance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author： Lance
 * @create： 2024/11/14
 * @Description TestController
 **/
@RequestMapping
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello Spring Security";
    }
}