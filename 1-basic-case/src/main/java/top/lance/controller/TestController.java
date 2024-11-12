package top.lance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： Lance
 * @create： 2024/11/12
 * @Description TestController
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public Object test() {
        return "Hello World!";
    }
}